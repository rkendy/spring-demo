package com.example.demo._01dependencyinjection.controller;

import com.example.demo._01dependencyinjection.service.MyService;

import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final MyService myService;

    public ConstructorInjectedController(MyService myService) {
        this.myService = myService;
    }

    public String myMethod() {
        return myService.myMethod();
    }

}