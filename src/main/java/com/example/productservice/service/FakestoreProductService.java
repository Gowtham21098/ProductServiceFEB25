package com.example.productservice.service;

import com.example.productservice.dto.FakeStoreResponseDTO;
import com.example.productservice.model.Category;
import com.example.productservice.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakestoreProductService {

    private RestTemplate restTemplate;

    public FakestoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Product getProductById(Integer id){
        Product product = new Product();

        // call fakestore api
        ResponseEntity<FakeStoreResponseDTO> fakestoreresponse = restTemplate.getForEntity("https://fakestoreapi.com/products/"+id, FakeStoreResponseDTO.class);

        //Get the response
        FakeStoreResponseDTO response = fakestoreresponse.getBody();

        //convert the response to product model
        product = convertFakestoreResponseToProduct(response);

        //return

        return product;
    }

    private Product convertFakestoreResponseToProduct(FakeStoreResponseDTO response){
        Product product = new Product();
        Category category = new Category();
        category.setTitle(response.getCategory());

        product.setId(response.getId());
        product.setCategory(category);
        product.setDescription(response.getDescription());
        product.setImageUrl(response.getImage());
        product.setTitle(response.getTitle());

        return product;
    }


}
