package com.example.week_v_homework.repository;

import com.example.week_v_homework.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {
}
