package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;

@Entity
public class Mobile {
	
	@Id
	private int id;
	private String brand;
	private String model_name;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "mobile")
	private List<Applications>apps=new ArrayList<Applications>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public List<Applications> getApps() {
		return apps;
	}
	public void setApps(List<Applications> apps) {
		this.apps = apps;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", model_name=" + model_name + ", apps=" + apps + "]";
	}

	
	
	
}
