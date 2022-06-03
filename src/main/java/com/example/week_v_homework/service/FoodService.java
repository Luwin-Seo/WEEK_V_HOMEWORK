package com.example.week_v_homework.service;

import com.example.week_v_homework.dto.MenuRequestDto;
import com.example.week_v_homework.model.Food;
import com.example.week_v_homework.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {
    private final FoodRepository foodRepository;

    public void registerMenu(Long id, List<MenuRequestDto> requestDtos) {
        for (MenuRequestDto requestDto : requestDtos) {
            Food food = new Food(id, requestDto);
            foodRepository.save(food);
        }
    }
}
