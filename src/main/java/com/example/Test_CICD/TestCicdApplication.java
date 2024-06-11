package com.example.Test_CICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"TestController"})


public class TestCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCicdApplication.class, args);
	}

}
