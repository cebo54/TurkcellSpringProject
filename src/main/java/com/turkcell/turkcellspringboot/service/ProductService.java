package com.turkcell.turkcellspringboot.service;

import com.turkcell.turkcellspringboot.entity.Product;

import java.util.List;

public interface ProductService {
    Product add(Product product);
    List<Product> findAll();
    Product findById(int id);
    void delete(int id);
}
