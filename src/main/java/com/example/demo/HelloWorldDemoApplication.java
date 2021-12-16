package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HelloWorldDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello from bridgelabz");
		SpringApplication.run(HelloWorldDemoApplication.class, args);
	}

}
