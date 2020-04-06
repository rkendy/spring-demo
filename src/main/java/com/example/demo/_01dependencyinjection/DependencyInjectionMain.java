package com.example.demo._01dependencyinjection;

import com.example.demo._01dependencyinjection.controller.ConstructorInjectedController;
import com.example.demo._01dependencyinjection.controller.PropertyInjectedController;
import com.example.demo._01dependencyinjection.controller.SetterInjectedController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionMain {

    public static void main(String[] args) {
        ApplicationContext ap = SpringApplication.run(DependencyInjectionMain.class, args);

        PropertyInjectedController propController = (PropertyInjectedController) ap
                .getBean("propertyInjectedController");
        System.out.println(propController.myMethod());

        SetterInjectedController setterController = (SetterInjectedController) ap.getBean("setterInjectedController");
        System.out.println(setterController.myMethod());

        ConstructorInjectedController constructorController = (ConstructorInjectedController) ap
                .getBean("constructorInjectedController");
        System.out.println(constructorController.myMethod());
    }

}