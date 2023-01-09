package cn.itdebug.award;

import java.util.Map;

public interface ICommodity {

    void awardToUser(String uid, String commodityId, String bizId, Map<String, String> extraMap);
}
