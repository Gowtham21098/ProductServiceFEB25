package com.example.productservice.controller;

import com.example.productservice.model.Product;
import com.example.productservice.service.FakestoreProductService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private FakestoreProductService service;

    public ProductController(FakestoreProductService inputservice) {
        this.service = inputservice;
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") Integer id, HttpServletResponse httpServletResponse){

        if (id==null){
            throw new IllegalArgumentException("id is null");
        }

        Product response = service.getProductById(id);
        return response;

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
