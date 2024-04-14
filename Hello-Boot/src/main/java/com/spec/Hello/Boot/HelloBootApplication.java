package com.spec.Hello.Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@component scan
//@E
public class HelloBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloBootApplication.class, args);
		System.out.println("sanjay");
	}

}
