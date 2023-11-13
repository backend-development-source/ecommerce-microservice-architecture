package com.hoangtien2k3.orderservice.repository;

import com.hoangtien2k3.orderservice.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

// using JpaRepository in Hibernate
public interface OrderRepository extends JpaRepository<Order, Integer> {

}