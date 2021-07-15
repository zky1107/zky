package com.zky.test;

import java.util.Date;

/*
* 使用Date输出当前系统时间，以及3天后这一刻的时间
* */
public class ZkyTest01 {
    public static void main(String[] args) {
        //String data = "yyyy-MM-dd";
        //SimpleDateFormat sf = new SimpleDateFormat(data); //SimpleDateFormat简单日期格式
        Date date1 = new Date();
        //String formats = sf.format(date1);
        System.out.println("当前日期是 = " + date1);
        long t = date1.getTime();
         t += 1000*60*60*24*3L;
         date1.setTime(t);
        System.out.println("三天后日期是 = " + date1);


    }
}
