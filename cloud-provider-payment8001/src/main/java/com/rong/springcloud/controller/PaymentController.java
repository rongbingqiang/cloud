package com.rong.springcloud.controller;/**
 * @title: PaymentController
 * @projectName CloudRong
 * @description: TODO
 * @author 荣兵强
 * @date 2022/4/916:46
 */

import com.rong.springcloud.entity.CommonResult;
import com.rong.springcloud.entity.Payment;
import com.rong.springcloud.service.impl.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.sleuth.SpanName;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@Slf4j
//修改为多例
//@Scope("prototype")
public class PaymentController {
    @Resource
    private PaymentService paymentService;



    @PostMapping("/payment/create")
    public CommonResult creat(@RequestBody Payment payment){

        int result = paymentService.create(payment);
        log.info("****插入结："+System.identityHashCode(paymentService));
//        Payment data = paymentService.getById(1L);
//        log.info("----"+data);
        return new CommonResult().setCode(200).setMessage("chenggong").setData(result);
    }

    @PostMapping("/payment/select")
    public CommonResult select(@RequestBody Payment payment){

//        int result = paymentService.create(payment);
//        log.info("****插入结果："+result);
        Payment data = paymentService.getById(payment.getId());
        log.info("----"+data);
        return new CommonResult().setCode(200).setMessage("chenggong").setData(data);
    }

//    private  int num = 0;
//
//    @PostMapping("/payment/num")
//    public void creat(){
//        System.out.println(++num);
//    }
//
//    @PostMapping("/payment/num2")
//    public void creat1(){
//        System.out.println(++num);
//    }

}
