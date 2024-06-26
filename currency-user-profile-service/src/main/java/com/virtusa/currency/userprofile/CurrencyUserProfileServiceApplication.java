package com.virtusa.currency.userprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyUserProfileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyUserProfileServiceApplication.class, args);
	}

}
