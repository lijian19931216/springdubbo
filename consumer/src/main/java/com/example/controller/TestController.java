package com.example.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.service.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-08
 **/
@RestController
public class TestController {
    @Reference
    Service service;
    @RequestMapping("hello")
    public String hh(){
       return service.getString();
    }
}
