package com.muquanrui.springcloud.controller;

import com.muquanrui.springcloud.domain.CommonResult;
import com.muquanrui.springcloud.domain.Order;
import com.muquanrui.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author muquanrui
 * @date 2023/2/14 17:58
 */

@RestController
public class OrderController {
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
