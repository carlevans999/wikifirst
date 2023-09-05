package com.example.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //返回字符串
//@Controller //返回页面，前后端分离用不到
public class TestController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
