package com.example.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Primary
public class Jobseeker2 implements Job{

	

	public String applyjob() {
		// TODO Auto-generated method stub
		return "appling job as jobseeker2";
	}

}
