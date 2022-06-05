package com.example.week_v_homework.validator;

import com.example.week_v_homework.dto.RestaurantRequestDto;
import org.springframework.stereotype.Component;

@Component
public class RestaurantValidator {
    public static void validateRestaurantInput(RestaurantRequestDto requestDto) {

        if (requestDto.getName() == null)
        {throw new IllegalArgumentException("유효하지 않은 식당 이름");}

        if (requestDto.getDeliveryFee() < 0 ||
        requestDto.getDeliveryFee() > 10000 ||
        requestDto.getDeliveryFee()%500 != 0)
        {throw new IllegalArgumentException("유효하지 않은 배달비");}

        if(requestDto.getMinOrderPrice() < 1000 ||
        requestDto.getMinOrderPrice() > 100000 ||
        requestDto.getMinOrderPrice() % 100 != 0)
        {throw new IllegalArgumentException("유효하지 않은 최소 주문비");}
    }
}
