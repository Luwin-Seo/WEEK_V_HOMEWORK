package com.example.week_v_homework.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long restaurantId;

    @Column
    @OneToMany
    private List<Menu> oderedMenu;
}
