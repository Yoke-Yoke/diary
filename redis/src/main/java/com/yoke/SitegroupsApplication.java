package com.yoke;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pro.sitegroups.dao")
public class SitegroupsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SitegroupsApplication.class, args);
    }
}
