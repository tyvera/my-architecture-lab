package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        // 應用啟動時會自動執行這個方法
        // 在這裡插入我們的初始數據
        userRepository.save(new User("張三", 25, "user"));
        userRepository.save(new User("李四", 30, "admin"));
        userRepository.save(new User("王五", 22, "user"));
    }
}
