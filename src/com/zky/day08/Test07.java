package com.zky.day08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * 创建一个List集合，并存放10个随机数，然后排序该集合后输出
 * @author Xiloer
 * */
public class Test07 {
    public static void main(String[] args) {
        List list = new ArrayList();  //创建list集合
        Random random = new Random();  //Random:随机
        for (int i = 0; i < 10; i++) {  //并存放10个随机数
            list.add(random.nextInt(10)+1);
        }
        //System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("list = " + list);
    }
}
