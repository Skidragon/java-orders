package com.lambdaschool.orders.repository;

import com.lambdaschool.orders.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderInterface extends JpaRepository<Order, Long> {
}
