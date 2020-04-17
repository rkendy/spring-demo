package com.example.demo._05factorybeans.config;

import com.example.demo._05factorybeans.service.SomeService;
import com.example.demo._05factorybeans.service.SomeServiceFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class SomeServiceConfig {

    @Bean
    SomeServiceFactory someServiceFactory() {
        return new SomeServiceFactory();
    }

    @Bean
    @Primary
    @Profile({ "default", "type01" })
    SomeService someServiceType01(SomeServiceFactory someServiceFactory) {
        return someServiceFactory.createSomeService("01");
    }

    @Bean
    @Primary
    @Profile("type02")
    SomeService someServiceType02(SomeServiceFactory someServiceFactory) {
        return someServiceFactory.createSomeService("02");
    }

    @Bean
    @Primary
    @Profile("type03")
    SomeService someServiceType03(SomeServiceFactory someServiceFactory) {
        return someServiceFactory.createSomeService("03");
    }

}