package com.example.demo.servecies;

import org.springframework.stereotype.Component;

@Component
public class CreditCard implements Payment{

	@Override
	public String paybill() {
		// TODO Auto-generated method stub
		return "i want to paybill by using creditcard";
	}

}
