package com.example.Books;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@ComponentScan(basePackages = {"com.example.BooksController", "com.example.BooksRepository", "com.example.BooksService"})
@SpringBootApplication
@EntityScan(basePackages = "com.example.BooksModel")
@EnableJpaRepositories(basePackages = "com.example.BooksRepository")
public class BooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}
}
	

