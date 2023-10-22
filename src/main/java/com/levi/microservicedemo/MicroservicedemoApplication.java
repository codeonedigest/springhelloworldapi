package com.levi.microservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MicroservicedemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroservicedemoApplication.class, args);
	}
}
