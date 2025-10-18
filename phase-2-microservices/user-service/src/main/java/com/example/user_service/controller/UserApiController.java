package com.example.user_service.controller;

import com.example.user_service.model.User;
import com.example.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 1. 使用 @RestController，宣告這是一個 API 控制器
@RestController
// 2. 為這個控制器下的所有 API 設置一個統一的基礎路徑 "/api"
@RequestMapping("/api")
public class UserApiController {

    // 3. 和之前一樣，注入 UserRepository 來操作數據庫
    @Autowired
    private UserRepository userRepository;

    // 4. 創建一個處理 GET 請求的方法，用來獲取所有用戶
    @GetMapping("/users")
    public List<User> getAllUsers() {
        // 5. 注意！方法直接返回 List<User> 對象
        // Spring Boot 會自動將這個列表轉換成 JSON 數組
        return userRepository.findAll();
    }
    // 使用 @PostMapping 来处理 POST 请求
    @PostMapping("/users")
    public User createUser(@RequestBody User newUser) {
        // 2. @RequestBody 会自动将前端发来的 JSON 数据转换成 User 对象
        // 3. 调用 save 方法，JPA 会智能地执行 INSERT 操作并将生成了新 ID 的 User 对象返回
        return userRepository.save(newUser);
    }
}