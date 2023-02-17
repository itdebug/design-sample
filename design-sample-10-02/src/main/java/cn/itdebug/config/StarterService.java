package cn.itdebug.config;

import org.springframework.stereotype.Component;

public class StarterService {

    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separatorChar) {
        return this.userStr.split(separatorChar);
    }
}
