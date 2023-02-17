package cn.itdebug;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ActivityFactory {

    static Map<Long, Activity> activityMap = new HashMap<>();

    public static Activity getActivity(Long id) {
        Activity activity = activityMap.get(id);
        if(null == activity) {
            activity = new Activity();
            activity.setId(10001L);
            activity.setName("图书系统");
            activity.setDesc("图书优惠券分享激励");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            activityMap.put(id, activity);
        }
        return activity;
    }
}
