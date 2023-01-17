package cn.itdebug;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class MQAdapter {

    public static CommonInfo filter(String strJson, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    public static CommonInfo filter(Map obj, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        CommonInfo commonInfo = new CommonInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            CommonInfo.class.getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1), String.class).invoke(commonInfo, val.toString());
        }
        return commonInfo;
    }
}
