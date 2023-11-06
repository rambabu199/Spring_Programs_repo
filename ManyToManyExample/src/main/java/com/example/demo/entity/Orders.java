package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ordername;
	private double ordervalue;
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "orders")
	@JoinColumn(name="u_id",referencedColumnName = "id")
	private List<User>users=new ArrayList<>();
	
	
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	





	public Orders(String ordername, double ordervalue) {
		super();
		this.ordername = ordername;
		this.ordervalue = ordervalue;
	}







	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public double getOrdervalue() {
		return ordervalue;
	}
	public void setOrdervalue(double ordervalue) {
		this.ordervalue = ordervalue;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}







	@Override
	public String toString() {
		return "Orders [id=" + id + ", ordername=" + ordername + ", ordervalue=" + ordervalue + ", users=" + users
				+ "]";
	}
	
	
	
	
	

}
