package com.sportyshoes.p3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.p3.entity.Category;
import com.sportyshoes.p3.service.CategoryService;
@RestController
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@PostMapping("/add-category")
	public ResponseEntity<Category> addCategory(@RequestBody Category category) {
		Category c = null;
		try {
			c = this.categoryService.addCategory(category);
			System.out.println(category);
			return ResponseEntity.status(HttpStatus.CREATED).body(c);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
}
