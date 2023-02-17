package cn.itdebug;

import java.util.Date;

public class ActivityController {

    public Activity queryActivityInfo(Long id) {
        Activity activity = new Activity();
        activity.setId(10001L);
        activity.setName("图书系统");
        activity.setDesc("图书优惠券分享激励");
        activity.setStartTime(new Date());
        activity.setStopTime(new Date());
        activity.setStock(new Stock(1000, 1));
        return activity;
    }
}
