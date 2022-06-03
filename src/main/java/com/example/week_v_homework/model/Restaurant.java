package com.example.week_v_homework.model;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String restaurantName;

    @Column
    private int minOrderPrice;

    @Column
    private int deliveryFee;


}
