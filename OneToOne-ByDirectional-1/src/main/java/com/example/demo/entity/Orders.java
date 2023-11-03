package com.example.demo.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="one_Orders")
public class Orders {
	@Id
	private int id;
	private double price;
	
	private int quantity;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "ord")
	//@JoinColumn(name="a_id",referencedColumnName = "id" )
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", price=" + price + ", "+" quantity=" + quantity + ", address=" + address + "]";
	}
	
	

}
