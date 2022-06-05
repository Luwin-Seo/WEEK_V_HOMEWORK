package com.example.week_v_homework.validator;

import org.springframework.stereotype.Component;

@Component
public class OrderDetailValidator {
    public static void validateOrderDetailIput(Long orderId, Long foodId, String foodName, int quantity) {

        if (orderId == null) {throw new NullPointerException("유효하지 않은 주문번호");}
        if (foodId == null) {throw new NullPointerException("유효하지 않은 메뉴");}
        if (foodName == null) {throw new NullPointerException("유효하지 않은 메뉴");}
        if (quantity < 0 || quantity > 100) {throw new IllegalArgumentException("유효하지 않은 주문수량");}
    }
}
