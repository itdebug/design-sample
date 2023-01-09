package cn.itdebug.impl;

import cn.itdebug.CacheService;
import cn.itdebug.RedisUtils;
import cn.itdebug.matter.Ctrip;
import cn.itdebug.matter.ELK;

import java.util.concurrent.TimeUnit;

public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    private Ctrip ctrip = new Ctrip();
    private ELK elk = new ELK();

    @Override
    public String get(String key, int redisType) {
        if(1 == redisType) {
            return ctrip.get(key);
        }

        if(2 == redisType) {
            return elk.gain(key);
        }
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value, int redisType) {
        if(1 == redisType) {
            ctrip.set(key, value);
            return;
        }

        if(2 == redisType) {
            elk.set(key, value);
            return;
        }
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType) {
        if(1 == redisType) {
            ctrip.setExpire(key, value, timeout, timeUnit);
            return;
        }

        if(2 == redisType) {
            elk.setEx(key, value, timeout, timeUnit);
            return;
        }
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key, int redisType) {
        if(1 == redisType) {
            ctrip.delete(key);
            return;
        }

        if(2 == redisType) {
            elk.delete(key);
            return;
        }
        redisUtils.del(key);
    }
}
