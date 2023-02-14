package com.muquanrui.springcloud.service.impl;

import com.muquanrui.springcloud.entity.CommonResult;
import com.muquanrui.springcloud.entity.Payment;
import com.muquanrui.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author muquanrui
 * @date 2023/2/13 11:47
 */

@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}