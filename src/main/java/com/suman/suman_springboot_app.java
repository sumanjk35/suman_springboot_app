package com.suman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class suman_springboot_app extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(suman_springboot_app.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(suman_springboot_app.class);
	}
}
