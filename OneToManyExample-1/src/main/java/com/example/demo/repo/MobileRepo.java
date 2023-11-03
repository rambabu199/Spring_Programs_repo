package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Mobile_Number;

public interface MobileRepo extends JpaRepository<Mobile_Number, Integer> {

}
