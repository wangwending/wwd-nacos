package com.wwd.nacos.controller;

import com.wwd.nacos.service.INacosService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class DemoController {

    @Autowired
    private INacosService nacosService;

    /**
     *
     * hello 方法返回
     * @return
     */
    @GetMapping("/hello")
    public String hello() {

        return nacosService.hello();
    }

}