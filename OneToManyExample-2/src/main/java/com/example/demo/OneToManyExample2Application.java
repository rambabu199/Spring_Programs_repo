package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.College;
import com.example.demo.entity.Student;
import com.example.demo.repo.CollegeRepo;
import com.example.demo.repo.StudentRepo;

@SpringBootApplication
public class OneToManyExample2Application implements CommandLineRunner {
	@Autowired
	private CollegeRepo cr;
	@Autowired
	private StudentRepo sr;
	
	

	public static void main(String[] args) {
		SpringApplication.run(OneToManyExample2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		College c=new College("cbit", "hyd");
		Student s=new Student("ram", 20);
		Student s1=new Student("babu", 21);
		Student s2=new Student("krishan", 22);
		c.getStudents().add(s);
		c.getStudents().add(s1);
		c.getStudents().add(s2);
		cr.save(c);
		
		
	}

}
