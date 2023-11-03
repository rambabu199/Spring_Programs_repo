package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.impl.Pizza;

@Configuration
public class Configure {
public Pizza pizza;
@Bean
public Pizza getPizza() {
	
	return new Pizza();
}

}
