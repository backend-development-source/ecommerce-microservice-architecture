package com.hoangtien2k3.orderservice.helper;

import com.hoangtien2k3.orderservice.domain.Cart;
import com.hoangtien2k3.orderservice.domain.Order;
import com.hoangtien2k3.orderservice.dto.CartDto;
import com.hoangtien2k3.orderservice.dto.OrderDto;

public interface OrderMappingHelper {

    static OrderDto map(final Order order) {
        return OrderDto.builder()
                .orderId(order.getOrderId())
                .orderDate(order.getOrderDate())
                .orderDesc(order.getOrderDesc())
                .orderFee(order.getOrderFee())
                .cartDto(
                        CartDto.builder()
                                .cartId(order.getCart().getCartId())
                                .build())
                .build();
    }

    static Order map(final OrderDto orderDto) {
        return Order.builder()
                .orderId(orderDto.getOrderId())
                .orderDate(orderDto.getOrderDate())
                .orderDesc(orderDto.getOrderDesc())
                .orderFee(orderDto.getOrderFee())
                .cart(
                        Cart.builder()
                                .cartId(orderDto.getCartDto().getCartId())
                                .build())
                .build();
    }

}