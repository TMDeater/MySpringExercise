package com.springexe.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//public class SpringappApplication extends SpringBootServletInitializer {
public class SpringappApplication  {
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(SpringappApplication.class);
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringappApplication.class, args);
    }

}
