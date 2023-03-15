package com.tss.Zadanie1NazwiskoImie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.tss.controllers"})
public class Zadanie1Application {

	public static void main(String[] args) {
		SpringApplication.run(Zadanie1Application.class, args);
	}

}
