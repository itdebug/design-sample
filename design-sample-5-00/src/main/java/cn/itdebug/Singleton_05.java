package cn.itdebug;

public class Singleton_05 {

    private static volatile Singleton_05 instance;

    private Singleton_05() {
    }

    /**
     * volatile 关键字 + 方法级锁的使用 + 懒汉式
     * @return
     */
    public static Singleton_05 getInstance() {
        if (null != instance) return instance;
        synchronized (Singleton_05.class) {
            if (null == instance) {
                instance = new Singleton_05();
            }
        }
        return instance;
    }
}
