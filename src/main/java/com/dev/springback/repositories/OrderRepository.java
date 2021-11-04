package com.dev.springback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.springback.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
