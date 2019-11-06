package com.freedom.freedomServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启eureka注册中心服务
public class FreedomServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreedomServerApplication.class, args);
    }

}
