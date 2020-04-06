package com.example.demo._02qualifier;

import com.example.demo._02qualifier.controller.PropertyInjectedController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QualifierMain {

    public static void main(String[] args) {
        ApplicationContext ap = SpringApplication.run(QualifierMain.class, args);

        PropertyInjectedController propController = (PropertyInjectedController) ap
                .getBean("propertyInjectedController");
        System.out.println(propController.myMethod());

    }

}