package com.turkcell.turkcellspringboot.service;

import com.turkcell.turkcellspringboot.entity.Product;
import com.turkcell.turkcellspringboot.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product add(Product product) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Product update(Product product, int id) {
        return null;
    }
}
