package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Applications;
import com.example.demo.entity.Mobile;
import com.example.demo.repo.ApplicationsRepo;
import com.example.demo.repo.MobileRepo;

@SpringBootApplication
public class OneToManyExampleApplication implements CommandLineRunner{
	
	@Autowired
	private MobileRepo mobilerepo;
	@Autowired
	private ApplicationsRepo apprepo;
	

	public static void main(String[] args) {
		SpringApplication.run(OneToManyExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Mobile m=new Mobile();
		m.setId(1);
		m.setModel_name("x5");
		m.setBrand("poco");
		Applications a=new Applications();
		a.setId(1);
		a.setApp_name("cam");
		a.setMobile(m);
		
		Applications a2=new Applications();
		a2.setId(11);
		a2.setApp_name("bgmi");
		a2.setMobile(m);
		
		m.setApps(List.of(a,a2));
		mobilerepo.save(m);
		apprepo.saveAll(List.of(a,a2));
		
	}

}
