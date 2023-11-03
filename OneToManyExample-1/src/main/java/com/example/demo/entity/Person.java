package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="p_id",referencedColumnName = "id")
	private List<Mobile_Number>mob_nums=new ArrayList<Mobile_Number>();
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Mobile_Number> getMob_nums() {
		return mob_nums;
	}
	public void setMob_nums(List<Mobile_Number> mob_nums) {
		this.mob_nums = mob_nums;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mob_nums=" + mob_nums + "]";
	}
	
	
	
	

}
