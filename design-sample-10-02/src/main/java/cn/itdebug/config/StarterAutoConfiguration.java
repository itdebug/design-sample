package cn.itdebug.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(StarterService.class)
@EnableConfigurationProperties(StarterServiceProperties.class)
public class StarterAutoConfiguration {
    private Logger logger = LoggerFactory.getLogger(StarterAutoConfiguration.class);

    @Autowired
    private StarterServiceProperties properties;

    @Bean("starterService1")
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "itdebug.door", value = "enabled", havingValue = "true")
    StarterService starterService() {
        logger.info("StarterAutoConfiguration 配置启动");
        return new StarterService(properties.getUserStr());
    }
}
