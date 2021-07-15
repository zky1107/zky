package com.zky.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
* 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
* */
public class ZkyTest03 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的生日, 输入格式为:yyyy-MM-dd");
        String s = scanner.nextLine();
        Date parse = sdf.parse(s);
        Date date = new Date();
        long time = date.getTime() - parse.getTime(); //当前日期 - 你输入的生日
        long t = time/1000/60/60/24/7;  //再除以周
        System.out.println("你活了:"+t+"周了");
    }
}
