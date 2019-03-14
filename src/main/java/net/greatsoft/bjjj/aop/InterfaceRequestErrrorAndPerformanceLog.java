package net.greatsoft.bjjj.aop;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import net.greatsoft.bjjj.util.ResultSingleton;
import org.apache.commons.lang3.time.StopWatch;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * 使用AOP处理全局异常以及接口日志打印
 */
@Component
@Aspect
@Slf4j
public class InterfaceRequestErrrorAndPerformanceLog {

    @Pointcut(value = "execution(* net.greatsoft.bjjj.web.*.*.*(..))")
    public void pointCut() {

    }

    @Around("pointCut()")
    public ResultSingleton handleControllerMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        Stopwatch stopWatch = Stopwatch.createStarted();
        ResultSingleton resultSingleton = null;
        try {
            log.info("执行Controller开始: " + proceedingJoinPoint.getSignature() + " 参数：" + Lists.newArrayList(proceedingJoinPoint.getArgs()).toString());
            resultSingleton = (ResultSingleton)proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
            try {
                log.info("执行Controller结束: " + proceedingJoinPoint.getSignature() + "， 返回值：" + JSONObject.toJSONString(resultSingleton));
            } catch (Exception ex) {
                log.error(proceedingJoinPoint.getSignature()+" 接口记录返回结果失败！，原因为：{}", ex.getMessage());
            }
            Long consumeTime = stopWatch.stop().elapsed(TimeUnit.MILLISECONDS);
            log.info("耗时：" + consumeTime + "(毫秒)");
        } catch (Exception throwable) {
            resultSingleton = handlerException(proceedingJoinPoint, throwable);
        }
        return resultSingleton;
    }

    /**
     * 处理接口调用异常
     * @param pjp
     * @param e
     * @return
     */
    private ResultSingleton handlerException(ProceedingJoinPoint pjp, Throwable e) {
        ResultSingleton resultSingleton = null;
        if (e instanceof RuntimeException) {
            log.error("RuntimeException{方法：" + pjp.getSignature() + "， 参数：" + pjp.getArgs() + ",异常：" + e.getMessage() + "}", e);
            // resultSingleton = new APIResponse(APIResponse.FAIL,null,e.getMessage());
            resultSingleton = ResultSingleton.getInstance(ResultSingleton.CODE_FAIL, "系统报错, 请联系我们", e.getMessage());
        } else {
            log.error("异常{方法：" + pjp.getSignature() + "， 参数：" + pjp.getArgs() + ",异常：" + e.getMessage() + "}", e);
            resultSingleton = ResultSingleton.getInstance(ResultSingleton.CODE_FAIL, "系统报错, 请联系我们", e.getMessage());
        }
        return resultSingleton;
    }

}
