package net.greatsoft.bjjj.threadLocal;

import net.greatsoft.bjjj.entity.system.UserSystem;

/**
 * 使用ThreadLocal存储用户的信息
 */
public class RequestHolder {

    /**
     *  用户的信息
     */
    private final static ThreadLocal<UserSystem> reqeuestHolder = new ThreadLocal<>();

    /**
     * 提供插入ThreadLocal数据的方法
     * @param userSystem
     */
    public static void add(UserSystem userSystem) {
        reqeuestHolder.set(userSystem);
    }

    /**
     * 提供获取用户信息的方法
     * @return
     */
    public static UserSystem get() {
        return reqeuestHolder.get();
    }

    // 不移除会造成内存溢出 因为他会伴随这个整个项目运行
    // 需要接口真正处理的时候调用 使用interceptor
    public static void remove() {
        reqeuestHolder.remove();
    }
}
