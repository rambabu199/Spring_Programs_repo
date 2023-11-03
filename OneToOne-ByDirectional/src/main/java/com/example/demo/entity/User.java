package com.example.demo.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	@Id
	private int id;
	private String name;
	private String email;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
	@JoinColumn(name="up_id",referencedColumnName = "id")
	private UserProfile userpro;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserProfile getUerpro() {
		return userpro;
	}
	public void setUerpro(UserProfile userpro) {
		this.userpro = userpro;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", uerpro=" + userpro + "]";
	}
	
	
	

}
