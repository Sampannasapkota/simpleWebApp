package com.springBoot.simpleWebApp.service;

import com.springBoot.simpleWebApp.model.Product;
import com.springBoot.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import javax.management.AttributeNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

//    List<Product> products=new ArrayList<>(Arrays.asList(
//            new Product(1,"Mixture",10000),
//            new Product(2,"Mobile",20000))) ;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElseThrow(()-> new NoSuchElementException("Id not found"+id));
    }

   public void addProduct(Product prod){
        repo.save(prod);   }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}
