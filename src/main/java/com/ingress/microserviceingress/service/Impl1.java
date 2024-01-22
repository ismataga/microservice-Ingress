package com.ingress.microserviceingress.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class Impl1 implements  MyInterface{
    @Override
    public void test() {
        System.out.println("Impl 1");
    }
}
