package com.microservicioStock.microservicioStock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import javax.ws.rs.GET;

import java.net.URI;

import static org.springframework.web.servlet.function.RouterFunctions.route;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class microservicioStock {

	public static void main(String[] args) {
		SpringApplication.run(microservicioStock.class, args);
	}
//
//	@Bean
//	RouterFunction<ServerResponse> routerFunction() {
//		return route(GET("/swagger"), req -> ServerResponse.temporaryRedirect(URI.create("swagger-ui.html")).build());
//	}

}
