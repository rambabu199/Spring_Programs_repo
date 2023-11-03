package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.PizzaOrderController;

@SpringBootApplication
public class QualifierAnnotation1Application {

	public static void main(String[] args) {
		ApplicationContext c= SpringApplication.run(QualifierAnnotation1Application.class, args);
		PizzaOrderController pc=c.getBean(PizzaOrderController.class);
		System.out.println(pc.orderPizza());
	}

}
