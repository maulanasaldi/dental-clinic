package com.dentalclinic.dental_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.dentalclinic"})
public class DentalBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DentalBackendApplication.class, args);
	}

}
