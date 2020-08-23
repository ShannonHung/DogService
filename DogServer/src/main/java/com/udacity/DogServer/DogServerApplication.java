package com.udacity.DogServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DogServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogServerApplication.class, args);
	}

}
