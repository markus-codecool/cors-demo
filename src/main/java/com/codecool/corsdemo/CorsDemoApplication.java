package com.codecool.corsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CorsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CorsDemoApplication.class, args);
    }

}
