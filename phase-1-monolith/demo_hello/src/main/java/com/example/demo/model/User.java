package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data // Lombok 注解
@NoArgsConstructor // Lombok 注解
@AllArgsConstructor // Lombok 注解
@Entity // <-- 關鍵注解 1: 告訴 JPA，這是一個實體類，對應數據庫中的一張表
@Table(name = "users") // <-- 2. 添加這個注解，指定表名為 "users"
public class User {

    @Id // <-- 關鍵注解 2: 聲明這個屬性是主鍵 (Primary Key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // <-- 關鍵注解 3: 設置主鍵的生成策略為自增
    private Integer id;

    private String name;
    private int age;
    private String role;

    // 因為用了 Lombok，之前手寫的構造函數、Getter、Setter 都可以刪掉了！
    // 為了方便後面測試，我們手動保留一個不帶 id 的構造函數
    public User(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }
}