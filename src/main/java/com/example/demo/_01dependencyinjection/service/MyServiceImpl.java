package com.example.demo._01dependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    @Override
    public String myMethod() {
        return "My Method";
    }

}