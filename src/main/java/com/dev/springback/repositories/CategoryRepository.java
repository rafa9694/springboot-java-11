package com.dev.springback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.springback.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
