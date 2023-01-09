package cn.itdebug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class RedisUtils {

    private Logger logger = LoggerFactory.getLogger(RedisUtils.class);

    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String get(String key) {
        logger.info("Redis获取数据 key:{}", key);
        return dataMap.get(key);
    }

    public String set(String key, String value) {
        logger.info("Redis写入数据 key:{} val:{}", key, value);
        return dataMap.put(key, value);
    }

    public String set(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("Redis写入数据 key:{} val:{} timeout:{} timeUnit:{}", key, value, timeout, timeUnit);
        return dataMap.put(key, value);
    }

    public String del(String key) {
        logger.info("Redis删除数据 key:{}", key);
        return dataMap.remove(key);
    }
}
