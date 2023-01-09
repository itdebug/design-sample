package cn.itdebug.matter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class ELK {

    private Logger logger = LoggerFactory.getLogger(ELK.class);

    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String gain(String key) {
        logger.info("ELC获取数据 key: {}", key);
        return dataMap.get(key);
    }

    public String set(String key, String value) {
        logger.info("ELC写入数据 key: {} val: {}", key, value);
        return dataMap.put(key, value);
    }

    public String setEx(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("ELC写入数据 key: {} val: {} timeout: {} timeunit: {}", key, value, timeout, timeUnit);
        return dataMap.put(key, value);
    }

    public String delete(String key) {
        logger.info("ELC删除数据 key: {}", key);
        return dataMap.remove(key);
    }
}
