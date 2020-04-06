package com.example.demo._04lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LifeCycleMain {

    public static void main(String[] args) {
        ApplicationContext ap = SpringApplication.run(LifeCycleMain.class, args);
    }
}