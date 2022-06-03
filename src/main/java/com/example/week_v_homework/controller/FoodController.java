package com.example.week_v_homework.controller;

import com.example.week_v_homework.dto.MenuRequestDto;
import com.example.week_v_homework.model.Food;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant/{retaurantId}")
public class FoodController {

    @PostMapping("/food/register")
    public void registerMenu (@PathVariable String restaurantId, @RequestBody MenuRequestDto requestDto) {

    }

    @GetMapping("/foods")
    public List<Food> getMenuBoard (@PathVariable String retaurantId) {
        return null;
    }
}
