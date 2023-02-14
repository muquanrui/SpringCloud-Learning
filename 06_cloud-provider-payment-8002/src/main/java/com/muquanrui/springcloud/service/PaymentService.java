package com.muquanrui.springcloud.service;

import com.muquanrui.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author muquanrui
 * @date 2023/1/2 20:52
 */

public interface PaymentService {
    int createPayment(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
