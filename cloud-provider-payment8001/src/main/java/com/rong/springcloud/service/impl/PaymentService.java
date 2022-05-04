package com.rong.springcloud.service.impl;/**
 * @title: PaymentService
 * @projectName CloudRong
 * @description: TODO
 * @author 荣兵强
 * @date 2022/4/916:28
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rong.springcloud.dao.IPaymentDao;
import com.rong.springcloud.entity.Payment;
import com.rong.springcloud.service.IPaymentService;
import org.springframework.stereotype.Service;

/**
 * @title: PaymentService
 * @projectName CloudRong
 * @description: TODO
 * @author 荣兵强
 * @date 2022/4/916:28
 */
@Service
public class PaymentService extends ServiceImpl<IPaymentDao, Payment> implements IPaymentService {
    public int create(Payment payment) {
        return baseMapper.insert(payment);
    }
}
