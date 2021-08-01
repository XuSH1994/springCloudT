package com.sct.cn;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //排除自动配置
@EnableEurekaClient
@EnableTransactionManagement    // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@ComponentScan(basePackages = {"com.sct"})  //该注解默认会扫描该类所在的包下所有的配置类，相当于之前的 <context:component-scan>
@Slf4j
//@EnableDiscoveryClient  //声明注册中心客户端
@EnableFeignClients(basePackages = "com.sct")   //声明Feignk客户端
@EnableCaching  //开启查询缓存
@EnableAsync    //开启异步任务支持
@MapperScan("com.sct.cn.mapper")    //Mapper注入扫描
public class TeacherTApplication {
    public static void main(String[] args) {
        SpringApplication.run(TeacherTApplication.class,args);
    }
}
