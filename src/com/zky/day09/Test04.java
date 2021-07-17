package com.zky.day09;

import java.io.File;

/*
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Xiloer
 * */
public class Test04 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\DELL\\Desktop\\1+x");
        File[] files = file.listFiles(); //listFiles:列出文件列出目录
        for (File f:files) {
            System.out.println("所有文件:"+f.getName());
        }
            System.out.println("目录名字："+file.getName());
    }
}
