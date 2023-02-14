package com.muquanrui.springcloud.service;

import com.muquanrui.springcloud.entity.CommonResult;
import com.muquanrui.springcloud.entity.Payment;
import com.muquanrui.springcloud.service.impl.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author muquanrui
 * @date 2023/2/13 11:45
 */

@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}