package com.example.bean;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
@RequiredArgsConstructor(staticName = "of")
public class User {  

  private Long id;
  private String username;
  private String name;
  private int age;
  private BigDecimal balance;

}  