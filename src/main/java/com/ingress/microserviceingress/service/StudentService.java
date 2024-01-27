package com.ingress.microserviceingress.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
//    private final StudentRepository studentRepository;

    public String addStudent(String name) {
        System.out.println(name);
        return name;
    }

    public String getStudent(String name) {
        System.out.println(name);
        return name;
    }
}
