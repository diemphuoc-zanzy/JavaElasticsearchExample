package com.example.javaelasticsearchexample.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document(indexName = "product")
public class Product {

    private Integer id;
    private String code;
    private String name;
    private String description;
    private Integer quantity;
    private Integer price;

}
