package com.example.demo._03profile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ProfileName2")
@Service("ServiceName")
public class Service02 {

    // Usage:
    // 01. Set @Qualifier("ServiceName") at controller
    // 02. Set spring.profiles.active=ProfileName2 (application.properties)
}