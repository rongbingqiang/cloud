package com.rong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @title: PaymentMain8001
 * @projectName CloudRong
 * @description: TODO
 * @author 荣兵强
 * @date 2022/4/216:38
 */
@SpringBootApplication()
public class PaymentMain8001 {
    public static void main(String[] args) {
        ConfigurableApplicationContext test = SpringApplication.run(PaymentMain8001.class,args);
        System.out.println(test.getBeanFactory());
    }

}
