package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.CollegeController;

@SpringBootApplication
public class PrimaryAnnotation1Application {

	public static void main(String[] args) {
		ApplicationContext c= SpringApplication.run(PrimaryAnnotation1Application.class, args);
		CollegeController cc=c.getBean(CollegeController.class);
		System.out.println(cc.showresult());
	}

}
