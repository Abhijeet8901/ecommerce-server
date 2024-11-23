package com.abhijeet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhijeet.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
