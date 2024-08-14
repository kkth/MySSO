package com.kun.myoss.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; // 这里返回的应该是视图名称，Thymeleaf 会在 templates 文件夹中查找对应的模板文件
    }
}

