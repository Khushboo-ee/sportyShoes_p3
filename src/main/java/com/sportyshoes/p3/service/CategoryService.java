package com.sportyshoes.p3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.p3.dao.CategoryRepository;
import com.sportyshoes.p3.entity.Category;


@Service
public class CategoryService {

	@Autowired(required = false)
	private CategoryRepository categoryRepository;

	public Category addCategory(Category c) {
		Category result = this.categoryRepository.save(c);
		return result;
	}

	
}
