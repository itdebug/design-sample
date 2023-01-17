package cn.itdebug;

import org.junit.Test;

public class ApiTest {

    @Test
    public void testCreateAccount() {
        CreateAccountMqService mqService = new CreateAccountMqService();

        mqService.onMessage("{\"number\":\"11\", \"accountDate\":\"2023-01-17\"}");
    }
}
