package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.config.Configure;

@SpringBootApplication
public class JavaBasedConfigApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext c= (AnnotationConfigApplicationContext) SpringApplication.run(JavaBasedConfigApplication.class, args);
		Configure c1=c.getBean(Configure.class);
		System.out.println(c1.getPizza());
	}

}
