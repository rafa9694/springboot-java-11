package com.dev.springback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.springback.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
