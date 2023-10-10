package com.Food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Food.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
