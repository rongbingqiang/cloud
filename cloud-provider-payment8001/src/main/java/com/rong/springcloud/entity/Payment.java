package com.rong.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @title: Payment
 * @projectName CloudRong
 * @description: TODO
 * @author 荣兵强
 * @date 2022/4/915:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long id ;
    private String serial;
}
