package com.capg.mobilegamescloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MobileGamesCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileGamesCloudGatewayApplication.class, args);
	}

}
