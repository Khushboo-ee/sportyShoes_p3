package com.sportyshoes.p3.dao;

import org.springframework.data.repository.CrudRepository;

import com.sportyshoes.p3.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}
