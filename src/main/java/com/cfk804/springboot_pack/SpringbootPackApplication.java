package com.cfk804.springboot_pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootPackApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringbootPackApplication.class, args);
    }

}
