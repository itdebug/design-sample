package cn.itdebug.util;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class RedisUtils {

    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    private AtomicInteger stock = new AtomicInteger(0);

    public RedisUtils() {
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            int addAndGet = stock.addAndGet(1);
            System.out.println("addAndGet: " + addAndGet);
        }, 0, 100000, TimeUnit.MICROSECONDS);
    }

    public int getStockUsed() {
        return stock.get();
    }

    public static void main(String[] args) {
        RedisUtils redisUtils = new RedisUtils();
    }
}
