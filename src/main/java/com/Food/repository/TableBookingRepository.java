package com.Food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Food.entities.TableBooking;

public interface TableBookingRepository extends JpaRepository<TableBooking, Integer> {

}

