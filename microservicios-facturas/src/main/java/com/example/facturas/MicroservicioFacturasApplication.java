package com.example.facturas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicioFacturasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioFacturasApplication.class, args);
	}

}
