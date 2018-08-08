package com.example.service.impl;

import com.example.service.Service;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-08
 **/
@com.alibaba.dubbo.config.annotation.Service
public class ServiceImpl implements Service {
    @Override
    public String getString() {
        return "hello dubbo";
    }
}
