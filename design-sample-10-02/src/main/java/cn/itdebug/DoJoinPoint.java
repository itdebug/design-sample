package cn.itdebug;

import cn.itdebug.annonation.DoDoor;
import cn.itdebug.config.StarterService;
import com.alibaba.fastjson.JSON;
import org.apache.commons.beanutils.BeanUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Aspect
@Component
public class DoJoinPoint {

    private Logger logger = LoggerFactory.getLogger(DoJoinPoint.class);

    @Autowired
    private StarterService starterService;

    @Pointcut("@annotation(cn.itdebug.annonation.DoDoor)")
    public void aopPoint() {
    }

    @Around("aopPoint()")
    public Object doRouter(ProceedingJoinPoint jp) throws Throwable {
        Method method = getMethod(jp);
        DoDoor door = method.getAnnotation(DoDoor.class);
        String fieldValue = getFieldValue(door.key(), jp.getArgs());
        logger.info("itdebug door handler method：{} value：{}", method.getName(), fieldValue);
        if(null == fieldValue || "".equals(fieldValue)) {
            return jp.proceed();
        }
        String[] split = starterService.split(",");

        for(String str:split) {
            if(fieldValue.equals(str)) {
                return jp.proceed();
            }
        }
        return returnObject(door, method);
    }

    private Object returnObject(DoDoor door, Method method) throws InstantiationException, IllegalAccessException {
        Class<?> returnType = method.getReturnType();
        String returnJson = door.returnJson();
        if("".equals(returnJson)) {
            return returnType.newInstance();
        }
        return JSON.parseObject(returnJson, returnType);
    }

    /**
     * 在参数列表中获取指定字段值
     * @param field
     * @param args
     * @return
     */
    private String getFieldValue(String field, Object[] args) {
        String fieldValue = null;
        for(Object arg:args) {
            try {
                if(null == fieldValue || "".equals(fieldValue)) {
                    fieldValue = BeanUtils.getProperty(arg, field);
                } else {
                    break;
                }
            } catch (Exception e) {
                if(args.length == 1) {
                    return args[0].toString();
                }
            }
        }
        return fieldValue;
    }

    private Method getMethod(ProceedingJoinPoint jp) throws NoSuchMethodException {
        Signature signature = jp.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        return getClass(jp).getMethod(methodSignature.getName(), methodSignature.getParameterTypes());
    }

    private Class<? extends Object> getClass(JoinPoint jp) {
        return jp.getTarget().getClass();
    }
}
