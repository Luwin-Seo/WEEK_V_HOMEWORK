package com.example.week_v_homework.dto.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderDetailResponseDto {
    private String foodName;
    private int quantity;
    private int price;
}
