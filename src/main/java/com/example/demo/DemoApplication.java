package com.example.demo;

import com.example.demo.dependencyinjection.controller.ConstructorInjectedController;
import com.example.demo.dependencyinjection.controller.PropertyInjectedController;
import com.example.demo.dependencyinjection.controller.SetterInjectedController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(DemoApplication.class, args);
	}

}
