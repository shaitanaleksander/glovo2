package com.hillel.glovo2.repository;

import com.hillel.glovo2.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {

  void deleteAllByOrderId(int id);
}
