package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.User;
import com.example.demo.entity.UserProfile;
import com.example.demo.repo.UserProfileRepo;
import com.example.demo.repo.UserRepo;

@SpringBootApplication
public class OneToOneByDirectionalApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepo ur;
	@Autowired
	private UserProfileRepo upr;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneByDirectionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User u=new User();
		u.setName("ram");
		u.setId(1);
		u.setEmail("ram@gmail.com");
		UserProfile up=new UserProfile();
		up.setId(1);
		up.setAddress("vij");
		up.setMobile("7894561230");
		u.setUerpro(up);
		up.setUser(u);
		upr.save(up);
		ur.save(u);
		
	}

}
