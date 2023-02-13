package com.sportyshoes.p3.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Category {

	@Id
	private int categoryId;
	private String categoryName;
	@OneToOne(mappedBy = "category")
	@JsonBackReference
	private Order order;

	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Product product;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", order=" + order
				+ ", product=" + product + "]";
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int categoryId, String categoryName, Order order, Product product) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.order = order;
		this.product = product;
	}

	
}
