package com.example.order.dto;

import com.example.product.dto.ProductDto;
import com.example.user.dto.UserDto;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by sajacaros on 2017-04-26.
 */
public class OrderDto {
    @NoArgsConstructor
    @Getter
    @ToString
    public static class New {
        private Long userId;
        private Long productId;
        private Integer quantity;

        public New(Long userId, Long productId, Integer quantity) {
            this.userId = userId;
            this.productId = productId;
            this.quantity = quantity;
        }
    }

    @NoArgsConstructor
    @Getter
    @ToString
    @Setter
    public static class Details {
        private Long id;
        @JsonUnwrapped
        private New order;

        private ProductDto.Response product;
        private UserDto.Response user;

        public Details(Long id, Long userId, Long productId, Integer quantity) {
            this.id = id;
            this.order = new New(userId, productId, quantity);
        }
    }
}
