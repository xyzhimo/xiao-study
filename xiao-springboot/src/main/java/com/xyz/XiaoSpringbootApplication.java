package com.xyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.xyz","com.sxc.diamond.config"})
@SpringBootApplication
public class XiaoSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoSpringbootApplication.class, args);
    }
}
