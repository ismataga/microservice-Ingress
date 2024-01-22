package com.ingress.microserviceingress.model;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Test1 {

    private final Test2 test2;
}
