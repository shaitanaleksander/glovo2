package com.hillel.glovo2.repository;

import com.hillel.glovo2.entity.Order;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Order,Integer> {

}
