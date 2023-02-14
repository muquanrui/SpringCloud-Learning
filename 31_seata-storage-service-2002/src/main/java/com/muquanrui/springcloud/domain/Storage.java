package com.muquanrui.springcloud.domain;

import lombok.Data;

/**
 * @author muquanrui
 * @date 2023/2/14 18:02
 */

@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}