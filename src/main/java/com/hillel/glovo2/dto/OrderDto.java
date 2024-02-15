package com.hillel.glovo2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class OrderDto {
  private  int id;
  private String owner;

  private List<ProductDto> products;
  private int cost;

}
