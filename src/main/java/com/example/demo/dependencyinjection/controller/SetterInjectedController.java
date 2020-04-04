package com.example.demo.dependencyinjection.controller;

import com.example.demo.dependencyinjection.service.MyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private MyService myService;

    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public String myMethod() {
        return myService.myMethod();
    }

}