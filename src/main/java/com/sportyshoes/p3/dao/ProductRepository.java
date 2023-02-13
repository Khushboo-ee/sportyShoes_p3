package com.sportyshoes.p3.dao;

import org.springframework.data.repository.CrudRepository;

import com.sportyshoes.p3.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
