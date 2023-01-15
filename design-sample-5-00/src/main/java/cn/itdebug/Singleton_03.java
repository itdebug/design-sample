package cn.itdebug;

public class Singleton_03 {

    private static Singleton_03 instance = new Singleton_03();

    private Singleton_03() {
    }

    /**
     * 静态属性 + 静态方法 + 饿汉式
     * @return
     */
    public static Singleton_03 getInstance() {
        return instance;
    }
}
