package com.EurekaClient.EurekaDemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDemo1Application.class, args);
	}

}
