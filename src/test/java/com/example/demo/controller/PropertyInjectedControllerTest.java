package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.demo._01dependencyinjection.controller.PropertyInjectedController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController controller;

    @Test
    void getGreeting() {
        assertTrue("My Method".equals(controller.myMethod()));
    }
}