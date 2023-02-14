package com.muquanrui.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author muquanrui
 * @date 2023/2/14 17:58
 */

@Configuration
@MapperScan({"com.muquanrui.springcloud.dao"})
public class MyBatisConfig {
}
