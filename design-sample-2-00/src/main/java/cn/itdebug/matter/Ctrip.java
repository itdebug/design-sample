package cn.itdebug.matter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class Ctrip {

    private Logger logger = LoggerFactory.getLogger(Ctrip.class);

    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String get(String key) {
        logger.info("Ctrip获取数据 key: {}", key);
        return dataMap.get(key);
    }

    public String set(String key, String value) {
        logger.info("Ctrip写入数据 key: {} val: {}", key, value);
        return dataMap.put(key, value);
    }

    public String setExpire(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("Ctrip写入数据 key: {} val: {} timeout: {} timeunit: {}", key, value, timeout, timeUnit);
        return dataMap.put(key, value);
    }

    public String delete(String key) {
        logger.info("Ctrip删除数据 key: {}", key);
        return dataMap.remove(key);
    }
}
