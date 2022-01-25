package com.jpdeveloper.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpdeveloper.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
