package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatwwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatwwayApplication.class, args);
		System.out.println("the gateway is running");
	}

}
