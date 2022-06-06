package com.example.week_v_homework.service;

import com.example.week_v_homework.dto.MenuRequestDto;
import com.example.week_v_homework.model.Food;
import com.example.week_v_homework.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class FoodService {
    private final FoodRepository foodRepository;

    @Transactional
    public void registerMenu(Long id, List<MenuRequestDto> requestDtos) {

        for (int i = 0; i < requestDtos.size(); i++) {
            if(foodRepository.findByRestaurantIdAndName(id, requestDtos.get(i).getName()).isPresent())
            {throw new IllegalArgumentException("중복된 메뉴 이름");}
            else {Food food = new Food(id, requestDtos.get(i));
            foodRepository.save(food);}
        }
    }
}
