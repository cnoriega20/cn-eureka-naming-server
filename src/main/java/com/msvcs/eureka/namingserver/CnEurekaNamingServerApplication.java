package com.msvcs.eureka.namingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CnEurekaNamingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CnEurekaNamingServerApplication.class, args);
    }

}
