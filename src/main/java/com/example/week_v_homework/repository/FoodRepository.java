package com.example.week_v_homework.repository;

import com.example.week_v_homework.dto.MenuResponseDto;
import com.example.week_v_homework.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findAllByRestaurantId(Long id);
    Optional<Food> findByRestaurantIdAndName(Long id, String name);
}
