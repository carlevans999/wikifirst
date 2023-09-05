package com.example.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController //返回字符串
//@Controller //返回页面，前后端分离用不到
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello get ";
    }

    @PostMapping("/hello")
    public String hellopost(String name) {
        return "Hello post." + name;
    }
}
