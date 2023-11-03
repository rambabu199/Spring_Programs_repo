package com.example.demo.services;

import org.springframework.stereotype.Component;

@Component
public class VegPizza implements Order{

	@Override
	public String putOrder() {
		// TODO Auto-generated method stub
		return "i want vegpizza";
	}

}
