package com.example.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Student2 implements Result{

	@Override
	public String marks() {
		// TODO Auto-generated method stub
		return "Student2 marks are"+50;
	}

}
