package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class UserProfile {
	@Id
	private int id;
	private String mobile;
	private String address;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="u_id",referencedColumnName = "id")
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", mobile=" + mobile + ", address=" + address + ", user=" + user + "]";
	}
	

}
