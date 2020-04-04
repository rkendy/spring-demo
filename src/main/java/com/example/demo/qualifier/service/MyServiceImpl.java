package com.example.demo.qualifier.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    @Override
    public String myMethod() {
        return "My Method";
    }

}