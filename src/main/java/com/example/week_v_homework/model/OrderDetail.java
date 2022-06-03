package com.example.week_v_homework.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class OrderDetail {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long orderId;

    @Column
    private Long foodId;

    @Column
    private int Quantity;

    @Column
    private int price;

}
