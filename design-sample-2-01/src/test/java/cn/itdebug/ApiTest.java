package cn.itdebug;

import cn.itdebug.impl.CacheServiceImpl;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_cacheService() {
        CacheService cacheService = new CacheServiceImpl();
        cacheService.set("user_name_01", "马斯克", 1);
        String userName01 = cacheService.get("user_name_01", 1);
        System.out.println("测试结果 => " + userName01);
    }
}
