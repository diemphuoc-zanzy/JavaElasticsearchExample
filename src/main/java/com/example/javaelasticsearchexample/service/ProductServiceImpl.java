package com.example.javaelasticsearchexample.service;

import com.example.javaelasticsearchexample.entities.Product;
import com.example.javaelasticsearchexample.reponsitories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product insertProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product, Integer id) {
        Optional<Product> productOpt = productRepository.findById(id);
        try {
            if (productOpt.isEmpty()) {
            }
            Product productExist = productOpt.get();
            productExist.setPrice(product.getPrice());
            productExist.setQuantity(product.getQuantity());
            productRepository.save(productExist);
            return productExist;
        } catch (Exception e) {
            try {
                throw e;
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }
}
