package com.example.demo.dependencyinjection.controller;

import com.example.demo.dependencyinjection.service.MyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    private MyService myService;

    public String myMethod() {
        return myService.myMethod();
    }

}