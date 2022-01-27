package com.jpdeveloper.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpdeveloper.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
