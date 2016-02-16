package com.formento.spring.boot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootHeroku2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHeroku2Application.class, args);
    }

}
