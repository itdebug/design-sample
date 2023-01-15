package cn.itdebug;

public class Singleton_04 {

    private static class SingletonHolder {
        private static Singleton_04 instance = new Singleton_04();
    }

    private Singleton_04() {
    }

    /**
     * 静态内部类 + 饿汉式
     * @return
     */
    public static Singleton_04 getInstance() {
        return SingletonHolder.instance;
    }
}
