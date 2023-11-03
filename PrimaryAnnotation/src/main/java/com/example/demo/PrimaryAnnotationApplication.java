package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.PaymentProcessor;

@SpringBootApplication
public class PrimaryAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext c= SpringApplication.run(PrimaryAnnotationApplication.class, args);
		PaymentProcessor p=c.getBean(PaymentProcessor.class);
		System.out.println(p.dopayment());
	
	}

}
