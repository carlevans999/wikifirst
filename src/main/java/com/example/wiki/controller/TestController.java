package com.example.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //返回字符串
//@Controller //返回页面，前后端分离用不到
public class TestController {

    @Value("${test.wfq:TEST}")
    private String testwfq;
    @GetMapping("/hello")
    public String hello() {
        return "Hello get " +testwfq;
    }

    @PostMapping("/hello")
    public String hellopost(String name) {
        return "Hello post." + name;
    }
}
