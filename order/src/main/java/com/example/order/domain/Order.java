package com.example.order.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by sajacaros on 2017-04-26.
 */
@Entity
@Table(name = "product_order")
@NoArgsConstructor
@ToString
@Getter
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    private Long userId;
    private Long productId;
    private Integer quantity;

    public Order(Long userId, Long productId, Integer quantity) {
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }
}
