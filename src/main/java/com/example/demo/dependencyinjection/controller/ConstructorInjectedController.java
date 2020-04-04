package com.example.demo.dependencyinjection.controller;

import com.example.demo.dependencyinjection.service.MyService;

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