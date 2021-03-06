package com.example.demo._06properties;

import com.example.demo._06properties.config.PropertyConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PropertyMain {
    public static void main(final String[] args) {
        final ApplicationContext ap = SpringApplication.run(PropertyMain.class, args);
        final PropertyConfig config = (PropertyConfig) ap.getBean("propertyConfig");
        System.out.println("============ From property:");
        System.out.println(config.getUsername());
        System.out.println(config.getPassword());

        // export SOME_PROPERTY_USERNAME=xxx
        // will override the "some.property.username" property.
        // you can also get from Environment:
        System.out.println("============ From environment:");
        System.out.println(config.getUsername());
        System.out.println(config.getUsernameFromEnv());

        System.out.println("============ From yaml:");
        System.out.println(config.getYamlUserName());
        System.out.println(config.getOtherYamlUserName());

        System.out.println("============ From property based on the profile:");
        System.out.println(config.getPropxyz());
    }

}