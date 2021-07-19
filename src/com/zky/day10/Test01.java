package com.zky.day10;

import java.io.File;

/*
* 遍历 你D盘 的 其中一个文件夹 , 并查找出 文件中带有 java 的 文件
* */
public class Test01 {
    public static void main(String[] args) {
        File file = new File("D:\\");
        getFile(file);
    }

    private static void getFile(File dir){
        File[] files = dir.listFiles();  //创建数组
        if (files!=null){   //如果存放文件的数组不为空
            for (File file : files) {   //遍历
                if(file.isDirectory()){   //判断 如果文件是目录
                    getFile(file);      //那么就继续遍历
                }else {
                    if (file.getName().endsWith(".java")){   //endsWith:以...结束
                        //判断文件是不是.java文件
                        System.out.println(file.getAbsolutePath());   //getAbsolutePath:获取绝对路径
                    }
                }
            }
        }
    }
}
