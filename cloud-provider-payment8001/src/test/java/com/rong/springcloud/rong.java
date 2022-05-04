package com.rong.springcloud;

import java.util.*;

/**
 * @title: rong
 * @projectName CloudRong
 * @description: TODO
 * @author 荣兵强
 * @date 2022/4/2410:39
 */
public class rong {
    public static void main(String[] args) {
        //程序开始时间
        Long time1 = System.currentTimeMillis();

        String [] instructs = new String[101];

        //保存名称和数值
        final Map<String,Integer> map = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        //循环输入
        int index =0 ;
        while(true){
            String s = in.nextLine();
            //判断结束输入
            if(s.equals(""))
                break;
            else {
                instructs[index++] = s;
            }
        }
        List<String> list = new ArrayList<String>();
     //   System.out.println("Over Input");

        for (int i = 0 ;i< index ; ) {
            String order = new String(instructs[i]);
            String [] strings = order.split(" ");

            //指令名
            String instruct = strings[0];
            //键名
            String key = strings[1];


            if ("mov".equals(instruct)) {
                //map.containsKey(strings[1]);
                //value值
                String value = strings[2];
                list.add(key);
                if(map.containsKey(value)){
                    map.put(key,map.get(value));
                }else{
                    map.put(key,Integer.parseInt(value));
                }
            } else if ("inc".equals(instruct)) {
                map.put(key,map.get(key)+1);
            } else if ("dec".equals(instruct)) {
                map.put(key,map.get(key)-1);
            } else if ("jnz".equals(instruct) && !map.get(key).equals(0)) {
                //value值
                String value = strings[2];
                i+=Integer.parseInt(value);

                continue;
            }
            i++;
        }

//        for (Map.Entry<String,Integer> entry: map.entrySet()
//             ) {
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
        //遍历输出答案 对于答案输出顺序按照mov命令的添加顺序进行输出
        list.stream().forEach(item -> {
            System.out.println(item+" "+map.get(item));
        });
        in.close();
//        Long time2 = System.currentTimeMillis();
//
//        System.out.println(time2-time1);
    }
}
