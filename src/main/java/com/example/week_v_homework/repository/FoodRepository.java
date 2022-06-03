package com.example.week_v_homework.repository;

import com.example.week_v_homework.dto.MenuResponseDto;
import com.example.week_v_homework.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food, Long> {
    List<MenuResponseDto> findAllByRestaurantId(Long id);
}
