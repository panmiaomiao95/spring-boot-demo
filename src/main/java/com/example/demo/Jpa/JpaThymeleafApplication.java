package com.example.demo.Jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by Admin on 2018/2/26.
 */
@SpringBootApplication
public class JpaThymeleafApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
        return applicationBuilder.sources(JpaThymeleafApplication.class);
    }

    public static void main(String[] args)throws Exception {
        SpringApplication.run(JpaThymeleafApplication.class,args);
    }
}
