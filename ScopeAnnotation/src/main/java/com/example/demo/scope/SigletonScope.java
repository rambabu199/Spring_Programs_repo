package com.example.demo.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SigletonScope {

	public  SigletonScope()
	{
		System.out.println("create only one object of entire application");
	}
}
