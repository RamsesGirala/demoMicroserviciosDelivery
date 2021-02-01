package com.microservicioProveedores.microservicioProveedores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class microservicioProveedores {

	public static void main(String[] args) {
		SpringApplication.run(microservicioProveedores.class, args);
	}

}
