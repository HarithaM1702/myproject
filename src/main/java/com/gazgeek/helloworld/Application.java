package com.gazgeek.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Application {

    // hello
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }


}