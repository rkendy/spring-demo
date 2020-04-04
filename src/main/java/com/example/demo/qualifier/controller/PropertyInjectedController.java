package com.example.demo.qualifier.controller;

import com.example.demo.qualifier.service.MyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("myOtherServiceImpl")
    @Autowired
    private MyService myService;

    public String myMethod() {
        return myService.myMethod();
    }

}