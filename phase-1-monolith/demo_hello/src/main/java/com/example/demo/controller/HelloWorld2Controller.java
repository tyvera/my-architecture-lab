package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller; // 注意：這裡的導入變了
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

// 我們需要返回 HTML 頁面，所以這裡用 @Controller
@Controller
public class HelloWorld2Controller {

    // 之前返回字符串的 Hello World，需要加上 @ResponseBody
    @GetMapping("/hello2")
    @ResponseBody
    public String sayHello() {
        return "Hello World! My first Spring Boot project is running!";
    }

    // 這是我們的新方法
    @GetMapping("/user2")
    public String showUserPage(Model model) {
        // 1. 準備要傳遞給頁面的數據
        model.addAttribute("username", "雷丰陽");
        model.addAttribute("userRole", "超級管理員");

        // 2. 返回模板文件的名字
        return "user"; // Spring Boot 會自動去 templates 文件夾下尋找 user.html
    }

    // 為了保持之前的代碼不動，我們添加一個新方法
    @GetMapping("/users2") // 使用一個新的 URL 地址
    public String showUserList(Model model) {
        // 1. 創建一個用戶列表
        List<User> userList = new ArrayList<>();

        // 2. 向列表中添加幾個用戶數據 (將來這些數據會來自數據庫)
        userList.add(new User(1, "張三", 25, "user"));
        userList.add(new User(2, "李四", 30, "admin")); // 這是一個管理員
        userList.add(new User(3, "王五", 22, "user"));

        // 3. 將整個列表放入 Model 中，傳遞給模板
        model.addAttribute("users", userList); // key 叫做 "users"

        // 4. 返回模板文件的名字
        return "user-list"; // 我們將創建一個名為 user-list.html 的新模板
    }
}