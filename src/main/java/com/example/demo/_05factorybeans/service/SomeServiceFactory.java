package com.example.demo._05factorybeans.service;

public class SomeServiceFactory {

    public SomeService createSomeService(String type) {

        switch (type) {
            case "01":
                return new SomeService01Impl();
            case "02":
                return new SomeService02Impl();
            case "03":
                return new SomeService03Impl();
            default:
                return new SomeService01Impl();
        }

    }

}