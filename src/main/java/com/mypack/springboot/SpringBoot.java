package com.mypack.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mypack.springboot")
public class SpringBoot extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot.class, args);
	}

}
