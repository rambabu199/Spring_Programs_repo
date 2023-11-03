package com.example.demo.services;

import org.springframework.stereotype.Component;

@Component
public class Student1 implements Result{

	@Override
	public String marks() {
		// TODO Auto-generated method stub
		return "Student1 marks are"+90;
	}

}
