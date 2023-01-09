package org.itdebug.crm;

public enum AwardTypeEnum {

    VIP_CARD(0),
    COUPON(1),
    GOODS(2)
    ;

    private Integer code;

    AwardTypeEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
