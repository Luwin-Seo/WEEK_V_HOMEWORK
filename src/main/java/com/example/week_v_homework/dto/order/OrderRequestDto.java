package com.example.week_v_homework.dto.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class OrderRequestDto {

    private Long restaurantId;
    private List<OrderDetailRequestDto> orderDetailsRq;
}
