package com.turkcell.turkcellspringboot.service;

import com.turkcell.turkcellspringboot.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ProductServiceImpl implements ProductService{
    private List<Product> productList;

    public ProductServiceImpl(List<Product> productList) {
        this.productList=new ArrayList<Product>();
    }

    @Override
    public Product add(Product product) {
        Product p1=productList.stream().filter(p ->p.getName().equals(product.getName())).findAny().orElse(null);
        if(p1!=null){
            throw new RuntimeException("Product already exists");
        }


        Random random=new Random();
        product.setId(random.nextInt(10000));
        productList.add(product);
        return product;
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public Product findById(int id) {
        return productList.stream()
                .filter(product -> product.getId()==id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(int id) {
        Product product=findById(id);
        productList.remove(product);
    }
}
