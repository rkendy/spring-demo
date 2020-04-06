package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.demo._01dependencyinjection.controller.SetterInjectedController;
import com.example.demo._01dependencyinjection.service.MyServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setMyService(new MyServiceImpl());
    }

    @Test
    void testMyMethod() {
        System.out.println(controller.myMethod());
        assertTrue(true);
    }

}