package com.wwd.nacos.service.impl;

import com.wwd.nacos.config.NacosConfig;
import com.wwd.nacos.service.INacosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * @ClassName: NacosServiceImpl
 * @description: TODO
 * @author: wang.wd
 * @create: 2021-03-15 16:40:51
 */
@Service
@RefreshScope
public class NacosServiceImpl implements INacosService {

    @Autowired
    private NacosConfig nacosConfig;

    @Override
    public String hello() {
        System.err.println("hello :"+ nacosConfig.getA());
        return nacosConfig.getA();
    }
}