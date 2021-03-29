package com.microservices.addressdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AddressdetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressdetailsApplication.class, args);
	}

}
