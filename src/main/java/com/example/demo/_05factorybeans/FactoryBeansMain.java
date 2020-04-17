package com.example.demo._05factorybeans;

import com.example.demo._05factorybeans.controller.MyController;
import com.example.demo._05factorybeans.service.SomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FactoryBeansMain {

    @Autowired
    SomeService service;

    public static void main(String[] args) {
        ApplicationContext ap = SpringApplication.run(FactoryBeansMain.class, args);
        MyController controller = (MyController) ap.getBean("myController");
        System.out.println(controller.hello());
    }
}