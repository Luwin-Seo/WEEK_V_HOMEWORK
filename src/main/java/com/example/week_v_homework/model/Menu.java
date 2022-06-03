package com.example.week_v_homework.model;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Menu {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String meunName;

    @Column
    private int price;

    @Column
    private Long restaurantId;

}
