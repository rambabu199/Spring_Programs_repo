package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.services.Payment;
@Component
public class PaymentProcessor {
	private Payment pay;
	@Autowired
	public PaymentProcessor(Payment pay) {
		super();
		this.pay = pay;
	}
	public String dopayment()
	{
		return pay.paybill();
	}

}
