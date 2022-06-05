package com.example.week_v_homework.model;

import com.example.week_v_homework.dto.MenuRequestDto;
import com.example.week_v_homework.validator.MenuValidator;
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
public class Food {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long restaurantId;

    @Column
    private String name;

    @Column
    private int price;

    public Food(Long id, MenuRequestDto requestDto) {

        MenuValidator.validMenuInput(id, requestDto);

        this.restaurantId = id;
        this.name = requestDto.getName();
        this.price = requestDto.getPrice();
    }

}
