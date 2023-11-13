package com.hoangtien2k3.paymentservice.helper;

import com.hoangtien2k3.paymentservice.domain.Payment;
import com.hoangtien2k3.paymentservice.dto.OrderDto;
import com.hoangtien2k3.paymentservice.dto.PaymentDto;

public interface PaymentMappingHelper {
    static PaymentDto map(final Payment payment) {
        return PaymentDto.builder()
                .paymentId(payment.getPaymentId())
                .isPayed(payment.getIsPayed())
                .paymentStatus(payment.getPaymentStatus())
                .orderDto(
                        OrderDto.builder()
                                .orderId(payment.getOrderId())
                                .build())
                .build();
    }

    static Payment map(final PaymentDto paymentDto) {
        return Payment.builder()
                .paymentId(paymentDto.getPaymentId())
                .orderId(paymentDto.getOrderDto().getOrderId())
                .isPayed(paymentDto.getIsPayed())
                .paymentStatus(paymentDto.getPaymentStatus())
                .build();
    }
}
