package com.example.demo.impl;

public class Pizza {
	public String order()
	{
		return "i want pizza";
	}

	@Override
	public String toString() {
		return "Pizza [order()=" + order() + "]";
	}

}
