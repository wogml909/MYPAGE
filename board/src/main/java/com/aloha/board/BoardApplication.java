package com.aloha.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

	// @Override 
	// public void addResourceHandlerRegistry(){
	// 	WebMvcConfigurer.super.addResourceHandlers(registry);
	// 	registry.addResourceHandler()
	// }

}
