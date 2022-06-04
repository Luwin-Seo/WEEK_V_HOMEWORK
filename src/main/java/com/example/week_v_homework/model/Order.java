package com.example.week_v_homework.model;

import com.example.week_v_homework.dto.order.OrderRequestDto;
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
}
