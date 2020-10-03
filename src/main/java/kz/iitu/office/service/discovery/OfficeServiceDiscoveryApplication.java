package kz.iitu.office.service.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OfficeServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(OfficeServiceDiscoveryApplication.class, args);
    }

}
