package com.kasirmadura.backend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override public void addCorsMappings(CorsRegistry reg) {
                reg.addMapping("/**")
                        .allowedOrigins("*")      // saat dev boleh semua; nanti batasi domain
                        .allowedMethods("GET","POST","PUT","DELETE","PATCH","OPTIONS");
            }
        };
    }
}
