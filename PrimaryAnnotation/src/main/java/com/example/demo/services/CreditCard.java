package com.example.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CreditCard implements Payment{

	@Override
	public String paybill() {
		// TODO Auto-generated method stub
		return "i want to pay bill by using credicard";
	}

}
