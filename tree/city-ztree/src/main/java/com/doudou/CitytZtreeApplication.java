package com.doudou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.doudou.dao"})
public class CitytZtreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CitytZtreeApplication.class, args);
    }

}
