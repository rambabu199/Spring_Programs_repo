package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Orders;

public interface OrderRepo extends JpaRepository<Orders, Integer>{

}
