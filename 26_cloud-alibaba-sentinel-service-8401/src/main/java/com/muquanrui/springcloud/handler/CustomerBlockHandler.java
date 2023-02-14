package com.muquanrui.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.muquanrui.springcloud.entity.CommonResult;

/**
 * @author muquanrui
 * @date 2023/2/11 14:08
 */

public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
