package com.udacity.jwdnd.c1.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	@Bean
	public String basicMessage() {
		System.out.println("Inside Basic Message");
		return "Hello";
	}

	@Bean
	public String compoundMessage(String message) {
		System.out.println("Inside compound message, received "+ message);
		return message + ", Spring";
	}

	@Bean
	public int characterCount(String message) {
		System.out.println(message.length());
		return message.length();
	}
}
