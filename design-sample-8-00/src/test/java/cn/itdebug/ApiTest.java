package cn.itdebug;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_engine() {
        EngineService engineService = new EngineService();
        String process = engineService.process("张三", "man", 29);
        logger.info("测试结果：{}", process);
    }
}
