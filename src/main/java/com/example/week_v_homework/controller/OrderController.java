package com.example.week_v_homework.controller;

import com.example.week_v_homework.dto.order.OrderRequestDto;
import com.example.week_v_homework.dto.order.OrderResponseDto;
import com.example.week_v_homework.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/order/request")
    public OrderResponseDto orderRequest(@RequestBody OrderRequestDto requestDto) {
        return orderService.orderRequest(requestDto);
    }

    @GetMapping("/orders")
    public List<OrderResponseDto> orderInquiry(){
        return orderService.getOrders();
    }
}
