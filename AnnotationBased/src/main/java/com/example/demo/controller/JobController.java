package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.example.demo.services.Job;
@Component
public class JobController {
	@Autowired
	private Job j;
	
	public String show()
	{
		return j.applyjob();
	}

}
