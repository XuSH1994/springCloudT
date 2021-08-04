package com.sct.cn;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient
@EnableAsync
@EnableTransactionManagement
@EnableCaching
@Slf4j
@EnableFeignClients(basePackages = "com.sct")
@ComponentScan(basePackages = {"com.sct"})
@MapperScan("com.sct.cn.mapper")
public class StudentTApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentTApplication.class,args);
    }
}



