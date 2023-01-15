package cn.itdebug;

import org.junit.Test;

public class ApiTest {

    @Test
    public void test00() {
        System.out.println(Singleton_00.singleton);
    }

    @Test
    public void test01() {
        System.out.println(Singleton_01.getInstance());
    }

    @Test
    public void test02() {
        System.out.println(Singleton_02.getInstance());
    }

    @Test
    public void test03() {
        System.out.println(Singleton_03.getInstance());
    }

    @Test
    public void test04() {
        System.out.println(Singleton_04.getInstance());
    }

    @Test
    public void test05() {
        System.out.println(Singleton_05.getInstance());
    }

    @Test
    public void test06() {
        System.out.println(Singleton_06.getInstance());
        System.out.println(Singleton_06.getInstance());
    }

    @Test
    public void test07() {
        Singleton_07.INSTANCE.hello();
    }
}
