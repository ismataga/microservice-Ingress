package com.ingress.microserviceingress.controller;

import com.ingress.microserviceingress.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    private String addStudent( String name) {
        return studentService.addStudent(name);

    }


}
