package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.App;

public interface AppRepo extends JpaRepository<App, Integer>{

}
