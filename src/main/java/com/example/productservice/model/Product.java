package com.example.productservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private Integer id;
    private String name;
    private String description;
    private String imageUrl;
    private Category category;


}
