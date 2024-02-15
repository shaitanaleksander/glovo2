package com.hillel.glovo2.entity;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.sql.Date;

@Data
@Builder
public class Order {
  @Id
  private int id;
  private String owner;
  @Column("created")
  private Date creationDate;
}
