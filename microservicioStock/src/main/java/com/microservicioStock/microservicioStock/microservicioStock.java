package com.microservicioStock.microservicioStock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class microservicioStock {

	public static void main(String[] args) {
		SpringApplication.run(microservicioStock.class, args);
	}

}
