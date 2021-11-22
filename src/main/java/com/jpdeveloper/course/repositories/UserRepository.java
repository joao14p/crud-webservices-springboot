package com.jpdeveloper.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpdeveloper.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
