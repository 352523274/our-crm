package com.qy25.sm;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.qy25.sm.mapper")
public class CrmApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrmApplication.class);
        System.out.println("aaaaaaaa");
    }
}
