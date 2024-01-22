package com.ingress.microserviceingress.service;

import org.springframework.stereotype.Service;

@Service
public class Impl2 implements  MyInterface{
    @Override
    public void test() {
        System.out.println("Impl 2");

    }
}
