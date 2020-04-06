package com.example.demo._03profile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ProfileName1")
@Service("ServiceName")
public class Service01 {

    // Usage:
    // 01. Set @Qualifier("ServiceName") at controller
    // 02. Set spring.profiles.active=ProfileName1 (application.properties)

    // Default profile:
    // @Profile({"ProfileName1", "default"})

}