package com.doudou.jstree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.doudou.jstree.dao"})
public class JstreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JstreeApplication.class, args);
    }

}
