package com.example.demomvntut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemomvnTutApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemomvnTutApplication.class, args);

        DuplicateZeros.main(args);

        System.out.println("Hello World!");
    }

}

