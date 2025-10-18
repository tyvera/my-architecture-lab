package com.example.user_service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // 1. 對所有 /api/ 開頭的路徑生效
                .allowedOrigins("http://localhost:5173") // 2. 允許來自這個源的請求
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 3. 允許的方法
                .allowCredentials(true)
                .maxAge(3600);
    }
}