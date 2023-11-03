package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.scope.BeanSample;
import com.example.demo.scope.BeanSamplePrototype;
import com.example.demo.scope.Prototype;
import com.example.demo.scope.SigletonScope;

@SpringBootApplication
public class ScopeAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext c= SpringApplication.run(ScopeAnnotationApplication.class, args);
		SigletonScope s1=c.getBean(SigletonScope.class);
		Prototype s2=c.getBean(Prototype.class);
		Prototype s3=c.getBean(Prototype.class);
		BeanSamplePrototype s4=c.getBean(BeanSamplePrototype.class);
		BeanSamplePrototype s5=c.getBean(BeanSamplePrototype.class);
		BeanSamplePrototype s6=c.getBean(BeanSamplePrototype.class);
		BeanSample s7=c.getBean(BeanSample.class);
	}

}
