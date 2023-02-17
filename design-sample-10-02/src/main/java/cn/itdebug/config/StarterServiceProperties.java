package cn.itdebug.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("itdebug.door")
public class StarterServiceProperties {

    private Logger logger = LoggerFactory.getLogger(StarterAutoConfiguration.class);

    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }
}
