package com.hillel.glovo2.converter;

import com.hillel.glovo2.dto.ProductDto;
import com.hillel.glovo2.entity.Product;

public class ProductConverter {

  public static ProductDto toProductDto(Product product) {
    return ProductDto.builder().price(product.getPrice()).id(product.getId()).name(product.getName()).build();
  }

  public static Product toProduct(ProductDto productDto) {
    return Product.builder().id(productDto.getId())
            .name(productDto.getName())
            .price(productDto.getPrice())
            .build();
  }
}
