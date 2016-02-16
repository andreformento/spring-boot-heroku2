package com.formento.spring.boot.config;

import com.formento.spring.boot.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {
        HelloController.class})
public class SpringBootHeroku2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHeroku2Application.class, args);
    }

}
