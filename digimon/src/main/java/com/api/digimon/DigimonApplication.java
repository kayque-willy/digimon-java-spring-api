package com.api.digimon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DigimonApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DigimonApplication.class, args);
		System.out.println("API listen on port 8080: http://localhost:8080/api/digimons");
	}

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DigimonApplication.class);
    }

}
