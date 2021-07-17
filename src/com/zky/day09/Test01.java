package com.zky.day09;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2016-03-23 14:22:16
 * @author Xiloer
 * */
public class Test01 {
    public static void main(String[] args) {
        File file = new File("myfile.txt"); //创建myfile.txt文件
        //输出文件的名字
        String name = file.getName();
        System.out.println("项目目录下的名字为：" + name);
        //输出文件大小
        long length = file.length();
        System.out.println("项目目录下的大小为：" + length);
        //输出文件最后修改时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar ins = Calendar.getInstance();
        long l = file.lastModified();
        ins.setTimeInMillis(l);
        System.out.println(sdf.format(ins.getTime()));

    }
}
