package com.turkcell.turkcellspringboot.controller;

import com.turkcell.turkcellspringboot.entity.Product;
import com.turkcell.turkcellspringboot.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {

    private ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }
    @GetMapping("{id}")
    public Product getProduct(@PathVariable int id) {
        return productService.findById(id);
    }
    @PostMapping
    public Product addProduct(@RequestBody @Valid Product product){
         return productService.add(product);
    }
    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.delete(id);
    }
    @PutMapping("{id}")
    public Product updateProduct(@RequestBody @Valid Product product, @PathVariable int id) {
        return productService.update(product,id);
    }
}
