package com.example.week_v_homework.model;

import com.example.week_v_homework.dto.order.OrderRequestDto;
import com.example.week_v_homework.validator.OrderValidator;
import com.example.week_v_homework.validator.RestaurantValidator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "orderBase")
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String restaurantName;

    @Column
    private int deliveryFee;

    @Column
    private int totalPrice;

    public Order (String restaurantName, int deliveryFee, int totalPrice) {

        OrderValidator.validateOrderInput(restaurantName,deliveryFee,totalPrice);

        this.restaurantName = restaurantName;
        this.deliveryFee = deliveryFee;
        this.totalPrice = totalPrice;
    }
}
