package com.zky.day08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
* 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入集合，然后对该集合排序后输出所有日期。
* @author Xiloer
* */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scan = new Scanner(System.in);
        List<Date> list = new ArrayList<Date>();
        for(int i=0;i<3;i++){  //循环3次
            System.out.println("请输入第:"+(i+1)+"个日期 格式为yyyy-MM-dd:");
            String str = scan.nextLine();
            //转换date
            Date date = s.parse(str);
            //存入list集合
            list.add(date);
        }
        //输出集合中的日期
        /*System.out.println("输出集合中的日期:");
        for(Date date : list){
            System.out.println(s.format(date));
        }*/
        Collections.sort(list);  //排序
        System.out.println("排序后输出集合中的日期:");
        for(Date date : list){
            System.out.println(s.format(date));
        }
    }
}
