package com.example.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author wxq
 */
@Data
public class User {

  private Long id;
  private String username;
  private int age;
  private BigDecimal balance;

}