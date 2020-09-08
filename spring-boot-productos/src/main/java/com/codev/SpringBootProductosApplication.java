package com.codev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProductosApplication.class, args);
	}

}
