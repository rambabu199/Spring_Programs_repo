package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Address;
import com.example.demo.entity.Orders;
import com.example.demo.repo.AddressRepo;
import com.example.demo.repo.OrdersRepo;

@SpringBootApplication
public class OneToOneByDirectional1Application implements CommandLineRunner{
	@Autowired
	private AddressRepo ar;
	@Autowired
	private OrdersRepo or;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneByDirectional1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Orders o=new Orders();
		o.setId(2);
		o.setPrice(5120.23);
		o.setQuantity(210);
		Address a=new Address();
		a.setId(12);
		a.setCity("gun");
		
		o.setAddress(a);
		a.setOrd(o);
		
		or.save(o);
		
		
		
	}

}
