package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.ControllerClass;

@SpringBootApplication
public class AutowiredAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext c= SpringApplication.run(AutowiredAnnotationApplication.class, args);
		ControllerClass cc= c.getBean(ControllerClass.class);
		System.out.println(cc.access());
		System.out.println(cc.access1());
	}

}
