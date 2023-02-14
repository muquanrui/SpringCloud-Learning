package com.muquanrui.springcloud.mapper;

import com.muquanrui.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author muquanrui
 * @date 2023/1/2 20:27
 */

@Mapper
public interface PaymentMapper {
    int createPayment(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
