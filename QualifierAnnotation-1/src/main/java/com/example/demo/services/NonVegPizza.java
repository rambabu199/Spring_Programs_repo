package com.example.demo.services;

import org.springframework.stereotype.Component;

@Component
public class NonVegPizza implements Order{

	@Override
	public String putOrder() {
		// TODO Auto-generated method stub
		return "i want non veg pizza";
	}

}
