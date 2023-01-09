package cn.itdebug.factory;

import cn.itdebug.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JDKProxy {

    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter cacheAdapter) throws Exception {
        InvocationHandler invocationHandler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(contextClassLoader, new Class[]{classes[0]}, invocationHandler);

    }
}
