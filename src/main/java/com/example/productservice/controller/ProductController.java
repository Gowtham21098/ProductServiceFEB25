package com.example.productservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @GetMapping("/products/{id}")
    public void getProductById(@PathVariable("id") Integer id){
    }

    @PostMapping("/products")
    public void createProduct(){

    }

    @DeleteMapping("products/{id}")
    public void deleteProductById(@PathVariable("id") Integer id){

    }

    @GetMapping("/products")
    public void getAllProduct(){

    }

    @PutMapping("/products/{id}")
    public void updateProductById(@PathVariable("id") Integer id){

    }


}
