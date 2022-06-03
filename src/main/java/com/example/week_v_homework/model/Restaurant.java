package com.example.week_v_homework.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Restaurant {

    @Id
    @Getter
    @Setter
    @GeneratedValue
    private Long id;

    @Column
    private String restaurantName;

    @Column
    private int minOrderPrice;

    @Column
    private int deliveryFee;


}
