package com.wwd.nacos.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: NacaosConfig
 * @description: TODO
 * @author: wang.wd
 * @create: 2021-03-15 13:05:38
 */
@Configuration
@RefreshScope
public class NacosConfig {

    @Value("${a}")
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }


}