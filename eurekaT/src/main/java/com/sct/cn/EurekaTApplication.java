package com.sct.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaTApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaTApplication.class,args);
    }
}
