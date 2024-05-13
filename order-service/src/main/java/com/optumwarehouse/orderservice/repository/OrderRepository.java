package com.optumwarehouse.orderservice.repository;

import com.optumwarehouse.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
