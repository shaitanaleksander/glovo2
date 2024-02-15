package com.hillel.glovo2.converter;

import com.hillel.glovo2.dto.OrderDto;
import com.hillel.glovo2.entity.Order;

import java.sql.Date;
import java.time.LocalDate;

public class OrderConverter {

  public static OrderDto toOrderDto(Order order) {
    return OrderDto.builder().id(order.getId()).owner(order.getOwner()).build();
  }

  public static Order toOrder(OrderDto orderDto) {
    return Order.builder().id(orderDto.getId()).owner(orderDto.getOwner())
            .creationDate(Date.valueOf(LocalDate.now())).build();
  }
}
