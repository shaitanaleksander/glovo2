package com.hillel.glovo2.controller;

import com.hillel.glovo2.dto.OrderDto;
import com.hillel.glovo2.dto.ProductDto;
import com.hillel.glovo2.service.OrderService;
import com.hillel.glovo2.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderController {

  private OrderService orderService;
  private ProductService productService;

  @GetMapping("/{id}")
  public OrderDto getById(@PathVariable int id) {
    return this.orderService.getById(id);
  }

  @PutMapping
  public void update(@RequestBody OrderDto orderDto) {
     orderService.update(orderDto);
  }

  @PostMapping
  public OrderDto save(@RequestBody OrderDto order) {
    return orderService.save(order);
  }

  @PostMapping("{orderId}/products")
  public ProductDto addProduct(@PathVariable int orderId, @RequestBody ProductDto productDto) {
    return productService.save(productDto, orderId);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable int id) {

  }
}
