package com.rong.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rong.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 荣兵强
 * @title: IPaymentDao
 * @projectName CloudRong
 * @description: TODO
 * @date 2022/4/915:28
 */
@Mapper
public interface IPaymentDao extends BaseMapper<Payment> {

//    public int create(Payment payment);
//
//    public Payment getPaymentById(@Param("id") Long id);

}
