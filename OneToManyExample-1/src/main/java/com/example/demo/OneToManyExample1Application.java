package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Mobile_Number;
import com.example.demo.entity.Person;
import com.example.demo.repo.MobileRepo;
import com.example.demo.repo.PersonRepo;

@SpringBootApplication
public class OneToManyExample1Application implements CommandLineRunner{
	@Autowired
	private PersonRepo pr;
	@Autowired
	private MobileRepo mr;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyExample1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person p=new Person("rambabu");
		Mobile_Number m=new Mobile_Number(789456123L);
		Mobile_Number m1=new Mobile_Number(88888555L);
		Mobile_Number m2=new Mobile_Number(444555666L);
		p.getMob_nums().add(m);
		p.getMob_nums().add(m1);
		p.getMob_nums().add(m2);
		pr.save(p);
		
		System.out.println("sample");
	}

}
