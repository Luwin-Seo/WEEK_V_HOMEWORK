package com.example.week_v_homework.controller;

import com.example.week_v_homework.dto.RestaurantRequestDto;
import com.example.week_v_homework.model.Restaurant;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurant() {
        return null;
    }

    @PostMapping("/restaurant/register")
    public Restaurant registerRestaurant (@RequestBody RestaurantRequestDto requestDto) {
        return null;
    }
}
