package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.services.Result;

@Component
public class CollegeController {
	@Autowired
	private Result re;
public String showresult()
{
	return re.marks();
	}
}
