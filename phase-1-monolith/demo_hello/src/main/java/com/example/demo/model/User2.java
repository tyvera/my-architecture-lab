package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // <-- 自動生成所有屬性的 Getter, Setter, equals, hashCode, toString 方法
@NoArgsConstructor // <-- 自動生成一個無參構造函數
@AllArgsConstructor // <-- 自動生成一個包含所有參數的構造函數
public class User2 {
    private Integer id;
    private String name;
    private int age;
    private String role;
}

// 使用 record 關鍵字，把屬性像方法參數一樣寫在括號裡
//使用的是 JDK 17，您還可以使用 Java 14 之後引入的一個新特性：Record
//public record User(Integer id, String name, int age, String role) {
//}
