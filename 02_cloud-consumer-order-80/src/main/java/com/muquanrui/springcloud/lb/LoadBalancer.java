package com.muquanrui.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author muquanrui
 * @date 2023/1/5 17:12
 */

public interface LoadBalancer {
    ServiceInstance getInstance(List<ServiceInstance> serviceInstanceList);
}
