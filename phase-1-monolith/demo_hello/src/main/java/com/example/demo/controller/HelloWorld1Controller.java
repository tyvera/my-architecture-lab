package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld1Controller {
    // 創建一個方法，用來處理來自 "/hello" 的 GET 請求
    @GetMapping("/hello1")
    public String sayHello() {
        return "Hello World! My first Spring Boot project is running!";
    }
}
