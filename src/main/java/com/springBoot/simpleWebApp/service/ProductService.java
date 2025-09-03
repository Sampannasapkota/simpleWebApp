package com.springBoot.simpleWebApp.service;

import com.springBoot.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product> products= Arrays.asList(
            new Product(1,"Mixture",10000),
            new Product(2,"Mobile",20000));

    public List<Product> getProducts(){
        return products;
    }
}
