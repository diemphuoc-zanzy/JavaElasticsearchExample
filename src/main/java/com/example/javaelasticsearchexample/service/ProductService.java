package com.example.javaelasticsearchexample.service;

import com.example.javaelasticsearchexample.entities.Product;

import java.util.ArrayList;

public interface ProductService {
    default Iterable<Product> getProducts() { return new ArrayList<>(); }
    default Product insertProduct(Product product) { return new Product(); }
    default Product updateProduct(Product product, Integer id) { return new Product(); }
    default void deleteProduct(Integer id) { }
}
