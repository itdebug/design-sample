package cn.itdebug;

public class Singleton_02 {

    private static Singleton_02 instance;

    private Singleton_02() {
    }

    /**
     * 懒汉 + 线程安全 + 锁占用资源消耗大
     * @return
     */
    public static synchronized Singleton_02 getInstance() {
        if (null != instance) return instance;
        return new Singleton_02();
    }
}
