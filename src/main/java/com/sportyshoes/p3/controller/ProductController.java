package com.sportyshoes.p3.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.p3.dao.ProductRepository;
import com.sportyshoes.p3.entity.Product;
import com.sportyshoes.p3.service.ProductService;
@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	
	
	@PostMapping("/add-product")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		Product p = null;
		try {
			p = this.productService.addProduct(product);
			System.out.println(product);
			return ResponseEntity.status(HttpStatus.CREATED).body(p);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	
		
	
}
