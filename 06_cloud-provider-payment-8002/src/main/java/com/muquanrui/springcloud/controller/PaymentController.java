package com.muquanrui.springcloud.controller;

import com.muquanrui.springcloud.entity.CommonResult;
import com.muquanrui.springcloud.entity.Payment;
import com.muquanrui.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author muquanrui
 * @date 2023/1/2 20:54
 */

@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "create")
    public CommonResult<Integer> createPayment(@RequestBody Payment payment) {
        int result = paymentService.createPayment(payment);
        log.info("*****插入结果：" + result);
        if (result > 0) {
            return new CommonResult<>(200, "插入数据库成功, serverPort" + serverPort, result);
        } else {
            return new CommonResult<>(444, "插入数据库失败");
        }
    }

    @GetMapping(value = "get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果：" + payment);
        if (payment != null) {
            return new CommonResult<>(200, "查询数据库成功,  serverPort" + serverPort, payment);
        } else {
            return new CommonResult<>(444, "查询数据库失败");
        }
    }

    @GetMapping(value = "lb")
    public String getPaymentLB() {
        return serverPort;
    }

    @GetMapping(value = "feign/timeout")
    public String paymentFeignTimeout()
    {
        // 业务逻辑处理正确，但是需要耗费3秒钟
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}
