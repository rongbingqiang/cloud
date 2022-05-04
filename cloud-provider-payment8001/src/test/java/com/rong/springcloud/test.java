package com.rong.springcloud;
import com.rong.springcloud.dao.IPaymentDao;
import com.rong.springcloud.entity.Payment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: test
 * @projectName CloudRong
 * @description: TODO
 * @author 荣兵强
 * @date 2022/4/911:29
 */
@SpringBootTest
//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class test {
    @Autowired
    private IPaymentDao paymentDao;
    @Test
    public void test(){
//        Payment date = paymentDao.selectById(1L);
//        Payment user = new Payment();
//        user.setSerial("3");
//        int data = paymentDao.insert(user);
//        System.out.println(data);
//        String b = "3d";
//        final StringBuffer a = new StringBuffer();
//        a.append("3");
//        a.append("3");
//        StringBuffer c = new StringBuffer("3d");
       // System.out.println(c === b);
//        List<String> list = new ArrayList<>();
//        list.add("rong");
//        list.stream().forEach(o ->{
//            System.out.println(o);
//        });
//        char name = 'c';
//        switch (name){
//            default:
//            case 'a':
//                System.out.println("a");
//                break;
//            case 'b':
//                System.out.println("b");
//                break;
//        }
        int count = 0;
        char [] chars = {'1','2','3','4'};
        for (int i =0 ;i<4;i++){

            for (int j = 0 ;j<4 ;j++){
                for (int k = 0 ;k<4; k++){
                    if (chars[i] == chars [j] || chars[i] == chars[k] || chars[j]==chars[k]){
                        continue;
                    }
                    count++;
                    System.out.println(String.valueOf(chars[i])+String.valueOf(chars[j])+String.valueOf(chars[k])+"");
                }
            }
        }
        System.out.println(count);
    }

}
