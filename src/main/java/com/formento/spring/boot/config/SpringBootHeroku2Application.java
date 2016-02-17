package com.formento.spring.boot.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.formento.spring.boot.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {
        HelloController.class})
public class SpringBootHeroku2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHeroku2Application.class, args);
    }

    @Bean
    public Jackson2ObjectMapperBuilder objectMapperBuilder() {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.serializationInclusion(JsonInclude.Include.NON_NULL);
        return builder;
    }

}
