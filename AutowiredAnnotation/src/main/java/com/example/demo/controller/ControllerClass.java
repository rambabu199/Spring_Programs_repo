package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.services.NonVegPizza;
import com.example.demo.services.VegPizza;

public class ControllerClass {
private NonVegPizza nvpizza;
private VegPizza vpizza;
@Autowired
public ControllerClass(NonVegPizza nvpizza) {
	super();
	this.nvpizza = nvpizza;
}
@Autowired
public void setVpizza(VegPizza vpizza) {
	this.vpizza = vpizza;
}
public String access()
{
	return nvpizza.getPizza();
			}


public String access1()
{
	return vpizza.getpizza();
			}
}