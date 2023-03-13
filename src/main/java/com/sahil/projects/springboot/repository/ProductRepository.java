package com.sahil.projects.springboot.repository;
import com.sahil.projects.springboot.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}