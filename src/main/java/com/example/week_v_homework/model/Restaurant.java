package com.example.week_v_homework.model;

import com.example.week_v_homework.dto.RestaurantRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private int minOrderPrice;

    @Column
    private int deliveryFee;

    public Restaurant (RestaurantRequestDto requestDto) {
        this.name = requestDto.getName();
        this.minOrderPrice = requestDto.getMinOrderPrice();
        this.deliveryFee = requestDto.getDeliveryFee();
    }


}
