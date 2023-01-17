package cn.itdebug.mq;

import com.alibaba.fastjson.JSON;

import java.util.Date;

public class CreateAccount {
    private String number;

    private String address;

    private Date accountDate;

    private String desc;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Date accountDate) {
        this.accountDate = accountDate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
