package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurity2Application {

	public static void main(String[] args) {
		
		System.err.println("master");
		System.err.println("master2");
		System.err.println("master3");
		SpringApplication.run(SpringSecurity2Application.class, args);
	}

}
