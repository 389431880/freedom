package com.freedom.foundationClient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = {"com.freedom"})
@MapperScan("com.freedom.foundationDb.dao.mapper")
@EnableEurekaClient
//@EnableDistributedTransaction // lcn开启注解
public class FoundationClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoundationClientApplication.class, args);
    }

}
