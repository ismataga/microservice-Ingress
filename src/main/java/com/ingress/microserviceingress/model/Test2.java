package com.ingress.microserviceingress.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Test2 {
    private final Test1 test1;

    @Lazy
    public Test2(Test1 test1) {
        this.test1 = test1;
    }
}
