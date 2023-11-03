package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.JobController;

@SpringBootApplication
public class AnnotationBasedApplication {

	public static void main(String[] args) {
		ApplicationContext c= SpringApplication.run(AnnotationBasedApplication.class, args);
		JobController jc=c.getBean(JobController.class);
		System.out.println(jc.show());
	
	}

}
