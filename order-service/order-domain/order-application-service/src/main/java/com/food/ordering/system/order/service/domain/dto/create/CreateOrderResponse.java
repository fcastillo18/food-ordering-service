package com.food.ordering.system.order.service.domain.dto.create;

import com.food.ordering.system.domain.valueobject.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Builder
@Getter
@AllArgsConstructor
public class CreateOrderResponse {
    @NotNull
    private final UUID orderTrackingInd;
    @NotNull
    private OrderStatus orderStatus;
    @NotNull
    private String message;
}
