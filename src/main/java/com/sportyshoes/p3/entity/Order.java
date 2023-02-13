package com.sportyshoes.p3.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	private int orderId;
	private String orderDate;
	private int orderAmt;
	@OneToOne(mappedBy = "order")
	@JsonBackReference
	private Customer customer;

	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Category category;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderAmt() {
		return orderAmt;
	}

	public void setOrderAmt(int orderAmt) {
		this.orderAmt = orderAmt;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, String orderDate, int orderAmt, Customer customer, Category category) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderAmt = orderAmt;
		this.customer = customer;
		this.category = category;
	}
	
	

}
