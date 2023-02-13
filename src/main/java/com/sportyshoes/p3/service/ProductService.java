package com.sportyshoes.p3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.p3.dao.ProductRepository;
import com.sportyshoes.p3.entity.Product;

@Service
public class ProductService {

	@Autowired(required = false)
	private ProductRepository productRepository;

	public Product addProduct(Product p) {
		Product result = this.productRepository.save(p);
		return result;
	}
	
	public void deleteProduct(int prodId) {
		try {
			this.productRepository.deleteById(prodId);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
	}
}
