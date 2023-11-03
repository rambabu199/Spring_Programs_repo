package com.example.demo.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
@Bean
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public BeanSample getbean()
{
	return new BeanSample();
	}
@Bean
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public BeanSamplePrototype getpro()
{
	return new BeanSamplePrototype();
}
}
