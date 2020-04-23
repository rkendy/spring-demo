package com.example.demo._06properties.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:myproperty.properties")
// Multiple property sources:
// @PropertySources({
// @PropertySource("classpath:myproperty.properties"),
// @PropertySource("classpath:anotherproperty.properties")
// )}
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

    @Autowired
    Environment env;

    public String getUsernameFromEnv() {
        return env.getProperty("SOME_PROPERTY_USERNAME");
    }

    @Value("${yaml.property.username}")
    String yamlUsername;

    @Value("${yaml.other.username}")
    String otherYamlUsername;

    public String getYamlUserName() {
        return yamlUsername;
    }

    public String getOtherYamlUserName() {
        return otherYamlUsername;
    }

    @Value("${propxyz}")
    String propxyz;

    public String getPropxyz() {
        return propxyz;
    }

}