package com.zky.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
* */
public class ZkyTest02 {
    public static void main(String[] args) {
        String date ="yyyy/MM/dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(date);
        Date date1 = new Date();
        String DateStr = sdf.format(date1);
        System.out.println("当前时间是: " + DateStr);
    }
}
