package com.example.javaelasticsearchexample.reponsitories;

import com.example.javaelasticsearchexample.entities.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {

}
