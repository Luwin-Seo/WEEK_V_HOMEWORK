package com.example.week_v_homework.dto.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class OrderDetailRequestDto {
    private Long id;
    private int quantity;
}
