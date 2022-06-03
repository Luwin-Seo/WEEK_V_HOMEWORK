package com.example.week_v_homework.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long restaurantName;

    @Column
    private int deliveryFee;

    @Column
    private int totalPrice;



}
