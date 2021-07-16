package com.zky.day08;

import java.util.HashMap;
import java.util.Map;

public class TestJDK8 {
    public static void main(String[] args) {
        /*//遍历List
        //实例：
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.forEach(e -> System.out.println("e = " + e));*/

        /*//遍历Set
        //实例：
        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("赵六");
        set.forEach(e -> System.out.println("e = " + e));*/

        //遍历Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"赵六");
        map.forEach((key,value) -> System.out.println(key +"->"+ value));

    }
}
