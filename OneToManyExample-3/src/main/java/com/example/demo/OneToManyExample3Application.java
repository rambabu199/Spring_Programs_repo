package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.App;
import com.example.demo.entity.Mobile;
import com.example.demo.repo.AppRepo;
import com.example.demo.repo.MobileRepo;

@SpringBootApplication
public class OneToManyExample3Application implements CommandLineRunner {
	@Autowired
	private MobileRepo mr;
	@Autowired
	private AppRepo ar;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyExample3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Mobile m=new Mobile("poco");
		App a=new App("pubg");
		App a1=new App("cam");
		App a2=new App("ludo");
		m.getApps().add(a);
		m.getApps().add(a1);
		m.getApps().add(a2);
		mr.save(m);
		
		
	}

}
