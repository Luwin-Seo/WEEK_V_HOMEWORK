package com.example.week_v_homework.dto.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Getter
public class OrderResponseDto {
    private String restaurantName;
    private List<OrderDetailResponseDto> OrderDetailRp;
    private int deliveryFee;
    private int totalPrice;

    public OrderResponseDto(String restaurantName, List<OrderDetailResponseDto> orderDetailRp, int deliveryFee, int totalPrice) {
        this.restaurantName = restaurantName;
        this.OrderDetailRp = orderDetailRp;
        this.deliveryFee = deliveryFee;
        this.totalPrice = totalPrice;
    }
}
