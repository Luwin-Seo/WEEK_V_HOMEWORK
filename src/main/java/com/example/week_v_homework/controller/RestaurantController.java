package com.example.week_v_homework.controller;

import com.example.week_v_homework.dto.RestaurantRequestDto;
import com.example.week_v_homework.model.Restaurant;
import com.example.week_v_homework.repository.RestaurantRepository;
import com.example.week_v_homework.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;
    private final RestaurantRepository restaurantRepository;

    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurant() {
        return restaurantRepository.findAll();
    }

    @PostMapping("/restaurant/register")
    public Restaurant registerRestaurant (@RequestBody RestaurantRequestDto requestDto) {
        return restaurantService.createRestaurantRecord(requestDto);
    }
}
