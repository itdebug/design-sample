package cn.itdebug.impl;

import cn.itdebug.ICacheAdapter;
import cn.itdebug.matter.ELK;

import java.util.concurrent.TimeUnit;

public class ELKAdapter implements ICacheAdapter {

    private ELK elk = new ELK();

    @Override
    public String get(String key) {
        return elk.gain(key);
    }

    @Override
    public String set(String key, String value) {
        return elk.set(key, value);
    }

    @Override
    public String set(String key, String value, long timeout, TimeUnit timeUnit) {
        return elk.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public String del(String key) {
        return elk.delete(key);
    }
}
