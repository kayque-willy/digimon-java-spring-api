package com.api.digimon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DigimonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigimonApplication.class, args);
		System.out.println("API listen on port 8080: http://localhost:8080/api/digimons");
	}

}
