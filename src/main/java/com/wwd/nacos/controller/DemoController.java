package com.wwd.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DemoController
 * @description: nacos演示
 * @author: wang.wd
 * @create: 2021-03-14 09:23:31
 */
@RestController
@RequestMapping("/demo")
@RefreshScope
public class DemoController {

    @Value("${a}")
    private String a;

    /**
     *
     * hello 方法返回
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        return a;
    }

}