package com.abezafar.wineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WineServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WineServiceApplication.class, args);
	}
}
