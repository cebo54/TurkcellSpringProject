package com.turkcell.turkcellspringboot.repository;

import com.turkcell.turkcellspringboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
