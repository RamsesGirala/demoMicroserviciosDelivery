package com.example.comanda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicioComandaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioComandaApplication.class, args);
	}

}