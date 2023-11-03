package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Company;
import com.example.demo.repo.CompanyRepo;

@SpringBootApplication
public class SpringdatajpadataStoringMultipleValuesApplication implements CommandLineRunner{
	@Autowired
	CompanyRepo cr;

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpadataStoringMultipleValuesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Company c=new Company();
		c.setName("IBM");
		c.setSalary(123000);
		Company c1=new Company();
		c1.setName("infosys");
		c1.setSalary(147850);
		cr.saveAll(List.of(c,c1));*
		List<Company>company=new ArrayList<Company>();*/
		Company company[]=new Company[2];
		company[0]=new Company();
		
		company[0].setName("google");
		company[0].setSalary(1234560);
		company[1]=new Company();
		company[1].setName("facebook");
		company[1].setSalary(147852);
		cr.saveAll(List.of(company));
		
		
	}

}
