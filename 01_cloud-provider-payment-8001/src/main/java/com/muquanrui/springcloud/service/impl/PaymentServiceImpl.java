package com.muquanrui.springcloud.service.impl;

import com.muquanrui.springcloud.entity.Payment;
import com.muquanrui.springcloud.mapper.PaymentMapper;
import com.muquanrui.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author muquanrui
 * @date 2023/1/2 20:53
 */

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int createPayment(Payment payment) {
        return paymentMapper.createPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
