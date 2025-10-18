package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // <-- 告訴 Spring 這是一個數據倉庫組件
public interface UserRepository extends JpaRepository<User, Integer> {
    // Look at this! It's completely empty!
    // 看看這裡！完全是空的！
}