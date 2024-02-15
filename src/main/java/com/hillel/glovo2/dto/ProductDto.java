package com.hillel.glovo2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class ProductDto {
  private int id;
  private String name;
  private int price;
}
