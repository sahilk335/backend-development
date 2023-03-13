package com.sahil.repository;


import com.sahil.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}