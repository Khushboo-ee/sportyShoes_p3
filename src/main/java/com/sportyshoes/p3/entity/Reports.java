package com.sportyshoes.p3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reports {

	@Id
	private int rptId;
	private int custId;
	private String custName;
	private int orderId;
	private int orderPrice;
	private int categoryId;
	private int prodId;
	private int prodName;
	public int getRptId() {
		return rptId;
	}
	public void setRptId(int rptId) {
		this.rptId = rptId;
	}
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
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public int getProdName() {
		return prodName;
	}
	public void setProdName(int prodName) {
		this.prodName = prodName;
	}
	public Reports() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reports(int rptId, int custId, String custName, int orderId, int orderPrice, int categoryId, int prodId,
			int prodName) {
		super();
		this.rptId = rptId;
		this.custId = custId;
		this.custName = custName;
		this.orderId = orderId;
		this.orderPrice = orderPrice;
		this.categoryId = categoryId;
		this.prodId = prodId;
		this.prodName = prodName;
	}
	@Override
	public String toString() {
		return "Reports [rptId=" + rptId + ", custId=" + custId + ", custName=" + custName + ", orderId=" + orderId
				+ ", orderPrice=" + orderPrice + ", categoryId=" + categoryId + ", prodId=" + prodId + ", prodName="
				+ prodName + "]";
	}
	
	
	
}
