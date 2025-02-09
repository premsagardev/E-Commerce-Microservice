package com.ecommerce.productservice.service;

import com.ecommerce.productservice.model.Product;
import com.ecommerce.productservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    //create a product object
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

//to find all products
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    //to get product by id
    public Product getProductById(Long id){
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found!"));
    }

    //create or add a product

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

}
