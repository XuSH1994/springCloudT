package com.sct.cn;

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

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
@EnableAsync
@EnableTransactionManagement
@EnableCaching
@EnableFeignClients(basePackages = "com.sct")
@ComponentScan(basePackages = "com.sct")
@MapperScan("com.sct.cn.mapper")
public class StudentTApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentTApplication.class,args);
    }
}



