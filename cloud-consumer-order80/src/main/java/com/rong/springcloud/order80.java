package com.rong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Arrays;

/**
 * @title: PaymentMain8001
 * @projectName CloudRong
 * @description: TODO
 * @author 荣兵强
 * @date 2022/4/216:38
 */
@SpringBootApplication
@EnableEurekaClient
@EnableScheduling
public class order80 {
    public static void main(String[] args) {
        ConfigurableApplicationContext test = SpringApplication.run(order80.class,args);
        System.out.println(test.getBeanFactory());
    }

}
