package com.wwt.managemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.wwt.managemail.mapper")
public class ManagemailApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagemailApplication.class, args);
    }

}
