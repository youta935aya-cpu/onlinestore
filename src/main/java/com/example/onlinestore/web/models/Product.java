package com.example.onlinestore.web.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Product {
    private Long id;
    private String code;
    private String name;
    private Double price;
    private Integer quantity;
    private String image;
}
