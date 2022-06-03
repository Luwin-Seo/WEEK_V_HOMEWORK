package com.example.week_v_homework.dto.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class OrderResponseDto {
    private String restaurantName;
    private List<OrderDetailResponseDto> OrderDetailRp;
    private int deliveryFee;
    private int totalPrice;
}
