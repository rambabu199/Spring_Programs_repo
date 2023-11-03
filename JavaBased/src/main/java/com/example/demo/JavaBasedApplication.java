package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.config.EmpConfig;
import com.example.demo.impl.Employee1;
import com.example.demo.impl.Employee2;

@SpringBootApplication
public class JavaBasedApplication {

	public static void main(String[] args) {
		ApplicationContext c= SpringApplication.run(JavaBasedApplication.class, args);
		Employee1 em1=c.getBean(Employee1.class);
		System.out.println(em1.EmpInfo());
		Employee2 em2=c.getBean(Employee2.class);
		System.out.println(em2.EmpInfo());
		Employee2 em3=c.getBean(Employee2.class);
		System.out.println(em3.EmpInfo());
	}

}
