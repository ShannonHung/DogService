package com.udacity.dogclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DogclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogclientApplication.class, args);
	}

}
