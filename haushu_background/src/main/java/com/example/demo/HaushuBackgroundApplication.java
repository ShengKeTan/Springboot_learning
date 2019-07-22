package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@MapperScan(
        basePackages = "com.example.demo",
        annotationClass = Repository.class
)
public class HaushuBackgroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaushuBackgroundApplication.class, args);
    }

}
