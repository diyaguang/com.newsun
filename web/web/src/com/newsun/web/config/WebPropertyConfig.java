package com.newsun.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.config
 * User: diyaguang
 * Date: 2017-09-07 5:33 PM
 */
@Configuration
@PropertySource(value = "classpath:webConfig.properties")
public class WebPropertyConfig {
    /**
     *@Value("${testVar1}")
    public String testVar1;

     @Value("${testVar2}")
     public String testVar2;
     */
}
