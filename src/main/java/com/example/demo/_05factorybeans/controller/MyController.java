package com.example.demo._05factorybeans.controller;

import com.example.demo._05factorybeans.service.SomeService;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private SomeService someService;

    public MyController(SomeService someService) {
        this.someService = someService;
    }

    public String hello() {
        return someService.someMethod();
    }
}