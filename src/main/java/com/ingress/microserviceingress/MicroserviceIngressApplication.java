package com.ingress.microserviceingress;

import com.ingress.microserviceingress.config.Property;
import com.ingress.microserviceingress.service.MyInterface;
import com.ingress.microserviceingress.service.StudentService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class MicroserviceIngressApplication implements CommandLineRunner {
    //    @Value("${names}")
//    private List<String> names;
    @Autowired
    @Qualifier("impl2")
    private MyInterface myInterface;
    private final Property property;
    private final StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceIngressApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        myInterface.test();
    }
}
