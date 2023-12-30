package com.food.ordering.system.order.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class CreateOrderCommand {
    private final UUID customerId;
    private final UUID restaurantId;
    private final BigDecimal totalPrice;
    private final List<OrderItem> items;
    private final OrderAddress orderAddress;

}
