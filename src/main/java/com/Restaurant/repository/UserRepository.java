package com.Restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Restaurant.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
