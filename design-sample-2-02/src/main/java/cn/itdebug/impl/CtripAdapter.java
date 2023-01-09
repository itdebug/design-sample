package cn.itdebug.impl;

import cn.itdebug.ICacheAdapter;
import cn.itdebug.matter.Ctrip;

import java.util.concurrent.TimeUnit;

public class CtripAdapter implements ICacheAdapter {

    private Ctrip ctrip = new Ctrip();

    @Override
    public String get(String key) {
        return ctrip.get(key);
    }

    @Override
    public String set(String key, String value) {
        return ctrip.set(key, value);
    }

    @Override
    public String set(String key, String value, long timeout, TimeUnit timeUnit) {
        return ctrip.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public String del(String key) {
        return ctrip.delete(key);
    }
}
