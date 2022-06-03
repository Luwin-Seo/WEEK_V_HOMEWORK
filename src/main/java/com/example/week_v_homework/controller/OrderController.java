package com.example.week_v_homework.controller;

import com.example.week_v_homework.dto.order.OrderRequestDto;
import com.example.week_v_homework.dto.order.OrderResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @PostMapping("/order/request")
    public OrderResponseDto orderRequest(@RequestBody OrderRequestDto requestDto) {
        return null;
    }

    @GetMapping("/orders")
    public OrderResponseDto orderInquiry(){
        return null;
    }
}
