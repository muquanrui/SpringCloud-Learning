package com.muquanrui.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author muquanrui
 * @date 2023/1/5 15:59
 */

@Configuration
public class MyRibbonRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
