package com.ceres.firstspringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication

/**
 * 可以这样配置。 从@SpringBootApplication的父注解中可以看到，springboot的工作原理,核心几个注解@EnableAutoConfiguration等
 */
@RestController
@EnableAutoConfiguration
public class FirstSpringBootAppApplication {

    @RequestMapping
    String home() {
        return "hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringBootAppApplication.class, args);
    }

}

