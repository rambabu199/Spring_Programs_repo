package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Flipkart;
import com.example.demo.repo.FlipkartRepo;

@SpringBootApplication
public class SpringdatajpadatacountApplication implements CommandLineRunner{
	@Autowired
	private FlipkartRepo fr;

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpadatacountApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Flipkart f=new Flipkart();
		f.setProductname("laptop");
		f.setPrice(45229.22);
		Flipkart f1=new Flipkart();
		f1.setProductname("mobile");
		f1.setPrice(25229.22);
		Flipkart f2=new Flipkart();
		f2.setProductname("pendrive");
		f2.setPrice(1229.22);
		Flipkart f3=new Flipkart();
		f3.setProductname("ssd");
		f3.setPrice(5229.22);
		fr.saveAll(List.of(f,f1,f2,f3));
		*/
		System.out.println(fr.count());
		
	}

}
