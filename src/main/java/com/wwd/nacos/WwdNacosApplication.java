package com.wwd.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: WwdNacosApplication
 * @description: nacos 启动入口
 * @author: wang.wd
 * @create: 2021-03-13 11:20:08
 */
@SpringBootApplication
@RequestMapping("/demo")
public class WwdNacosApplication {

    /**
     *
     * nacos启动函数
     * @param args
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(WwdNacosApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("user.name");
        String userAge = applicationContext.getEnvironment().getProperty("user.age");
        String a = applicationContext.getEnvironment().getProperty("a");
        System.err.println("user name :"+userName+"; age: "+userAge+"; a="+a);
    }
}