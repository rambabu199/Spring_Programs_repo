package com.example.demo.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.demo.impl.Employee1;
import com.example.demo.impl.Employee2;

@Configuration
public class EmpConfig {
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public Employee1 emp1()
{
	return new Employee1();
}
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Employee2 emp2()
	{
		return new Employee2();
		
	}

}
