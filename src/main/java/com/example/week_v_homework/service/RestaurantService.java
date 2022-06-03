package com.example.week_v_homework.service;

import com.example.week_v_homework.dto.RestaurantRequestDto;
import com.example.week_v_homework.model.Restaurant;
import com.example.week_v_homework.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public Restaurant createRestaurantRecord(RestaurantRequestDto requestDto) {
        Restaurant restaurant = new Restaurant(requestDto);
        restaurantRepository.save(restaurant);
        return restaurant;
    }
}
