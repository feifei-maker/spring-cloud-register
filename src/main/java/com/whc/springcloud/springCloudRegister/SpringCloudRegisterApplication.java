package com.whc.springcloud.springCloudRegister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class SpringCloudRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudRegisterApplication.class, args);
    }

}
