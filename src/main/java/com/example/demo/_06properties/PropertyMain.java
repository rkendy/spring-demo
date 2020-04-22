package com.example.demo._06properties;

import com.example.demo._06properties.config.PropertyConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PropertyMain {
    public static void main(String[] args) {
        ApplicationContext ap = SpringApplication.run(PropertyMain.class, args);
        PropertyConfig config = (PropertyConfig) ap.getBean("propertyConfig");
        System.out.println(config.getUsername());
        System.out.println(config.getPassword());
    }

}