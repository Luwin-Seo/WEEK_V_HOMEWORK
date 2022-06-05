package com.example.week_v_homework.model;

import com.example.week_v_homework.validator.OrderDetailValidator;
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
    private String foodName;

    @Column
    private int Quantity;

    @Column
    private int price;

    public OrderDetail(Long orderId, Long foodId, String foodName, int quantity, int price) {

        OrderDetailValidator.validateOrderDetailIput(orderId,foodId,foodName,quantity);

        this.orderId = orderId;
        this.foodId = foodId;
        this.foodName = foodName;
        Quantity = quantity;
        this.price = price;
    }
}
