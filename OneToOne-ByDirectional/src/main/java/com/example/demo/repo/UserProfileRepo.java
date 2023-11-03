package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserProfile;

public interface UserProfileRepo extends JpaRepository<UserProfile, Integer>{

}
