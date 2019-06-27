package com.qf.student_springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.dao")
public class StudentSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentSpringbootApplication.class, args);
    }

}
