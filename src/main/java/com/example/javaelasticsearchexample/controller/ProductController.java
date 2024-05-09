package com.example.javaelasticsearchexample.controller;

import com.example.javaelasticsearchexample.entities.Product;
import com.example.javaelasticsearchexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/gets")
    public Iterable<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping("/insert")
    public Product insertProduct(@RequestBody Product product) {
        return productService.insertProduct(product);
    }

    @PostMapping("/update/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable Integer id) {
        return productService.updateProduct(product, id);
    }

    @PostMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }
}
