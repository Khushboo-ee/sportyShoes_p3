package com.sportyshoes.p3.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Customer {
	@Id
	public int custId;
	public String custName;
	public String custUsername;
	public String custPassword;
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	public Order order;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustUsername() {
		return custUsername;
	}
	public void setCustUsername(String custUsername) {
		this.custUsername = custUsername;
	}
	public String getCustPassword() {
		return custPassword;
	}
	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custUsername=" + custUsername
				+ ", custPassword=" + custPassword + ", order=" + order + "]";
	}
	public Customer(int custId, String custName, String custUsername, String custPassword, Order order) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custUsername = custUsername;
		this.custPassword = custPassword;
		this.order = order;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
