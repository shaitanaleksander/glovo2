package com.hillel.glovo2.service;

import com.hillel.glovo2.converter.ProductConverter;
import com.hillel.glovo2.dto.ProductDto;
import com.hillel.glovo2.entity.Product;
import com.hillel.glovo2.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProductService {
  private ProductRepository productRepository;


  public List<ProductDto> saveAll(List<ProductDto> products, int orderId) {
    return Optional.ofNullable(products)
            .map(productDtos -> productDtos.stream()
                    .map(p -> save(p, orderId)).toList())
            .orElse(List.of());
  }

  public ProductDto save(ProductDto product, int orderId) {

    Product productEntity = ProductConverter.toProduct(product);
    productEntity.setOrderId(orderId);
    productEntity = this.productRepository.save(productEntity);

    return ProductConverter.toProductDto(productEntity);
  }


  public void delete(int id) {
    this.productRepository.deleteById(id);
  }

  public void removeByOrderId(int id) {
    productRepository.deleteAllByOrderId(id);
  }
}
