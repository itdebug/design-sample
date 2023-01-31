package cn.itdebug;

public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);
}
