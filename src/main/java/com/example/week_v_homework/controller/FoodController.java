package com.example.week_v_homework.controller;

import com.example.week_v_homework.dto.MenuRequestDto;
import com.example.week_v_homework.dto.MenuResponseDto;
import com.example.week_v_homework.repository.FoodRepository;
import com.example.week_v_homework.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurant/{restaurantId}")
public class FoodController {
    private final FoodService foodService;
    private final FoodRepository foodRepository;

    @PostMapping("/food/register")
    public void registerMenu (@PathVariable Long restaurantId, @RequestBody List<MenuRequestDto> requestDtos) {
        foodService.registerMenu(restaurantId, requestDtos);
    }

    @GetMapping("/foods")
    public List<MenuResponseDto> getMenuBoard (@PathVariable Long restaurantId) {
        return foodRepository.findAllByRestaurantId(restaurantId);
    }
}
