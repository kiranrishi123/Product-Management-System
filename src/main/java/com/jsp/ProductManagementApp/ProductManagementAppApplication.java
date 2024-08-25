package com.jsp.ProductManagementApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.jsp")
@EntityScan(basePackages = "com.jsp")  
public class ProductManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagementAppApplication.class, args);
	}

}
