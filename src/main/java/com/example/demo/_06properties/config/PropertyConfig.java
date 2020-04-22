package com.example.demo._06properties.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:myproperty.properties")
@Component
public class PropertyConfig {

    @Value("${some.property.username}")
    String username;

    @Value("${some.property.password}")
    String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}