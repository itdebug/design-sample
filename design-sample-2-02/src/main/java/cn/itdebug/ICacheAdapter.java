package cn.itdebug;

import java.util.concurrent.TimeUnit;

public interface ICacheAdapter {

    String get(String key);
    String set(String key, String value);
    String set(String key, String value, long timeout, TimeUnit timeUnit);

    String del(String key);
}
