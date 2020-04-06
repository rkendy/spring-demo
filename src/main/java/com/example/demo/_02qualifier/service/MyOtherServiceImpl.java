package com.example.demo._02qualifier.service;

import org.springframework.stereotype.Service;

@Service
public class MyOtherServiceImpl implements MyService {

    @Override
    public String myMethod() {
        return "My Other Method";
    }

}