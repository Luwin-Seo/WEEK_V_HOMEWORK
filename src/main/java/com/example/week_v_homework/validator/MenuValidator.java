package com.example.week_v_homework.validator;

import com.example.week_v_homework.dto.MenuRequestDto;
import com.example.week_v_homework.model.Food;
import com.example.week_v_homework.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MenuValidator {
    public static void validMenuInput(Long id, MenuRequestDto requestDto) {
        if (requestDto.getPrice() < 100 ||
        requestDto.getPrice() > 1000000 ||
        requestDto.getPrice()%100 != 0)
        {throw new IllegalArgumentException("유효하지 않은 설정가격");}
    }
}
