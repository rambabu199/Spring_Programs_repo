package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepo;

@SpringBootApplication
public class ExampleUpdateApplication implements CommandLineRunner {
	@Autowired
	private ProductRepo pr;

	public static void main(String[] args) {
		SpringApplication.run(ExampleUpdateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Product p=new Product("samsung", 12300.55);
		Product p1=new Product("lg", 1000.55);
		pr.saveAll(List.of(p,p1));*/
		 Product p2=pr.findById(2).get();
		 p2.setName("poco");
		 p2.setPrice(14755.00);
		 pr.save(p2);
		
		
		
	}

}
