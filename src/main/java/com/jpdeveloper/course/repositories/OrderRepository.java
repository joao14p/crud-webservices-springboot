package com.jpdeveloper.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpdeveloper.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
