package com.hillel.glovo2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@Builder
public class Product {
  @Id
  private int id;
  private String name;
  private int price;
  private int orderId;

}
