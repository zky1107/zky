package com.zky.day08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/*
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * */
public class Test04 {
    public static void main(String[] args) {
        //创建一个List集合并添加元素0-9
        List<String> list = new ArrayList<>();
        for (int i = 0; i <10; i++) {   //从0 开始 到10-1
            list.add(i+"");
        }
        System.out.println("list = " + list);
        //然后获取子集[3,4,5,6]
        Collection list2 = new ArrayList();
        for (int i =3; i <=6; i++) {
            //将子集元素扩大10倍
            for (int j = 0; j <10; j++) {
                list2.add(i+"");
            }
        }
        System.out.println("list2 = " + list2);
        //然后输出原集合
        System.out.println("j = " + list2.size());
        //之后删除集合中的[7,8,9]
        list.remove("7");
        list.remove("8");
        list.remove("9");
        System.out.println("list = " + list);
    }
}
