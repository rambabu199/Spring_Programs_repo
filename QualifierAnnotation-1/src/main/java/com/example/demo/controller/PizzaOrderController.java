package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.services.Order;

@Component
public class PizzaOrderController {
private Order order;
@Autowired
public PizzaOrderController(@Qualifier("vegPizza") Order order) {
	super();
	this.order = order;
}
public String orderPizza()
{
	return order.putOrder();
	}
}
