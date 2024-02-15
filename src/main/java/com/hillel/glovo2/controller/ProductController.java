package com.hillel.glovo2.controller;

import com.hillel.glovo2.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

  private ProductService productService;

  @DeleteMapping("/{id}")
  public void delete(@PathVariable int id) {
    productService.delete(id);
  }

}
