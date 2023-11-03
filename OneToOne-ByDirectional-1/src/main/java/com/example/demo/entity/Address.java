package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="One_Address")
public class Address {
	@Id
	private int id;
	private String city;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="o_id",referencedColumnName = "id")
	private Orders ord;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Orders getOrd() {
		return ord;
	}
	public void setOrd(Orders ord) {
		this.ord = ord;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", ord=" + ord + "]";
	}
	

}
