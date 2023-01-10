package cn.itdebug;

import org.junit.Test;

public class ApiTest {

    @Test
    public void test_builder() {
        Builder builder = new Builder();

        System.out.println(builder.levelOne(132.520).getDetail());
        System.out.println(builder.levelTwo(98.520).getDetail());
        System.out.println(builder.levelThree(85.430).getDetail());
    }
}
