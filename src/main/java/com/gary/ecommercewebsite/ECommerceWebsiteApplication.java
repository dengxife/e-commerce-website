package com.gary.ecommercewebsite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.gary.ecommercewebsite.dao")
@SpringBootApplication
public class ECommerceWebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceWebsiteApplication.class, args);
    }

}
