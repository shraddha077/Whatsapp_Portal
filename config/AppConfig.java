package com.mypromotions.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Example bean
    @Bean
    public String exampleBean() {
        return "example";
    }
}
