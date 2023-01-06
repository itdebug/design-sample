package cn.itdebug.crm;

import java.util.Map;

public class AwardReq {

    /**
     * 用户唯一id
     */
    private String unionId;
    /**
     * 奖品类型
     */
    private AwardTypeEnum awardType;

    /**
     * 奖品编号：sku、couponNumber、cardId
     */
    private String awardNumber;
    /**
     * 业务id,防重复
     */
    private String bizId;
    /**
     * 扩展信息
     */
    private Map<String, String> extraMap;


    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public AwardTypeEnum getAwardType() {
        return awardType;
    }

    public void setAwardType(AwardTypeEnum awardType) {
        this.awardType = awardType;
    }

    public String getAwardNumber() {
        return awardNumber;
    }

    public void setAwardNumber(String awardNumber) {
        this.awardNumber = awardNumber;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Map<String, String> getExtraMap() {
        return extraMap;
    }

    public void setExtraMap(Map<String, String> extraMap) {
        this.extraMap = extraMap;
    }
}
