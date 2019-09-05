package com.hx.hxmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.hx.hxmall.dao"})
public class HxmallBootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HxmallBootWebApplication.class, args);
    }

}
