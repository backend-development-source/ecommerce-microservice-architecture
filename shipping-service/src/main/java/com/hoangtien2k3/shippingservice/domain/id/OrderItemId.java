package com.hoangtien2k3.shippingservice.domain.id;

import java.io.Serial;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderItemId implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    // primary keys in class properties
    private Integer productId;
    private Integer orderId;

}