package net.greatsoft.bjjj.util;

import java.io.Serializable;

/**
 * 创建返回给前台数据的Singleton对象
 */
public class ResultSingleton implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 成功返回码 0
     */
    public static Integer CODE_SUCCESS = 0;
    /**
     * 失败返回码 1
     */
    public static Integer CODE_FAIL = 1;

    /**
     * token无效的返回码
     */
    public static Integer TOKEN_FAIL = 2;


    /**
     * 成功或失败代码 成功是0 失败是非0
     */
    private Integer code;

    /**
     * 后台需要给前台的信息提示，如失败后，应该设置失败的具体原因
     */
    private String message;

    /**
     * 成功后返回的结果
     */
    private Object result;

    public static Integer getCodeSuccess() {
        return CODE_SUCCESS;
    }

    public static void setCodeSuccess(Integer codeSuccess) {
        CODE_SUCCESS = codeSuccess;
    }

    public static Integer getCodeFail() {
        return CODE_FAIL;
    }

    public static void setCodeFail(Integer codeFail) {
        CODE_FAIL = codeFail;
    }

    public static Integer getTokenFail() {
        return TOKEN_FAIL;
    }

    public static void setTokenFail(Integer tokenFail) {
        TOKEN_FAIL = tokenFail;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    // 1.私有化构造方法
    private ResultSingleton() {

    }

    /**
     * 提供对外方法
     * @param code
     * @param message
     * @param result
     * @return
     */
    public static ResultSingleton getInstance(Integer code, String message, Object result) {
        return Singleton.INSTANCE.getInstance(code, message, result);
    }

    // 使用枚举方式来定义单例模式
    private enum Singleton {
        INSTANCE;
        private  ResultSingleton resultSingleton;
        // jvm保证只调用一次
        Singleton() {
            resultSingleton = new ResultSingleton();
        }
        public ResultSingleton getInstance(Integer code, String message, Object result) {
            resultSingleton.code = code;
            resultSingleton.message = message;
            resultSingleton.result = result;
            return resultSingleton;
        }
    }

}
