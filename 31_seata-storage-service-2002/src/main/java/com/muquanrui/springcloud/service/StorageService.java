package com.muquanrui.springcloud.service;

/**
 * @author muquanrui
 * @date 2023/2/14 18:04
 */

public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
