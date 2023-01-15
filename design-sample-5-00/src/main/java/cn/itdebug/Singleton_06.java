package cn.itdebug;

import java.util.concurrent.atomic.AtomicReference;

public class Singleton_06 {

    private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<>();

    private static Singleton_06 instance;

    private Singleton_06() {
    }

    /**
     * 懒汉式 + CAS锁 +
     * @return
     */
    public static final Singleton_06 getInstance() {
        for (; ; ) {
            Singleton_06 instance = INSTANCE.get();
            if (null != instance) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new Singleton_06());
            return INSTANCE.get();
        }
    }


}
