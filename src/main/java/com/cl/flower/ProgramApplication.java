package com.cl.flower;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@SpringBootApplication
@MapperScan("com.cl.flower.mapper")
@EnableSwagger2
public class ProgramApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProgramApplication.class, args);
    }
}
