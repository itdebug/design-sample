package cn.itdebug;

public class Singleton_01 {

    private static Singleton_01 instance;

    private Singleton_01() {
    }

    /**
     * 懒汉，线程不安全
     * @return
     */
    public static Singleton_01 getInstance() {
        if(null != instance) return instance;
        return new Singleton_01();
    }
}
