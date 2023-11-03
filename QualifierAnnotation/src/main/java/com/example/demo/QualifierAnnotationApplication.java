package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.PaymentProcessor;

@SpringBootApplication
public class QualifierAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext c= SpringApplication.run(QualifierAnnotationApplication.class, args);
		PaymentProcessor p=c.getBean(PaymentProcessor.class);
		System.out.println(p.dopayment());
	
	
	}

}
