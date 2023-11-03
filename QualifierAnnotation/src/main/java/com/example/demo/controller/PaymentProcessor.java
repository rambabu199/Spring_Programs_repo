package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.servecies.Payment;
@Component
public class PaymentProcessor {
	private Payment pay;
	@Autowired
    public PaymentProcessor(@Qualifier("creditCard") Payment pay) {
		super();
		this.pay = pay;
	}
	
	public String dopayment()
	{
		return pay.paybill();
	}
	

}
