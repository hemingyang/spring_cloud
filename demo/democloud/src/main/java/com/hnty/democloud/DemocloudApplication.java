package com.hnty.democloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemocloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemocloudApplication.class, args);
    }

}
