package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Flipkart;

public interface FlipkartRepo extends JpaRepository<Flipkart, Integer>{

}
