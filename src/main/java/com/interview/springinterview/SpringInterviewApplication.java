package com.interview.springinterview;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.WebApplicationInitializer;

import jakarta.servlet.ServletContext;

@SpringBootApplication
public class SpringInterviewApplication implements WebApplicationInitializer{
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringInterviewApplication.class, args);
		
		
	}
	
	@Override
	public void onStartup(ServletContext servletContext) {
		
		servletContext.setInitParameter("spring.profiles.active", "dev");
	}

		
	

}
