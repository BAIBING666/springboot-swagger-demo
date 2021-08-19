package com.swagger.springbootswaggerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringbootSwaggerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSwaggerDemoApplication.class, args);
    }

}
