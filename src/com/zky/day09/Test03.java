package com.zky.day09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Xiloer
 * */
public class Test03 {
    public static void main(String[] args) throws IOException {
        //此扫描器执行当前行，并返回跳过的输入信息。nextLine()
        System.out.println("请输入一个目录名:");
        String s1 = new Scanner(System.in).nextLine();
        File file = new File(s1);
        file.mkdir();
        System.out.println("你创建的目录是：" + file.getName());
        boolean e = file.exists();
        if (!e) {  //若不存在
            file.mkdir();
        } else {
            System.out.println("用户该目录已经存在");
            int index = 0;
            while (e) {
                index++;
                file = new File("副本1" + index);
                e = file.exists();
            }
            file.mkdir();
        }
        System.out.println("文件名:" + file.getName());
    }
}
    /*//将此抽象路径名转换为一个路径名字符串。getPath()
        //String f = file.getName();
        String path = file.getPath();
        if (path.equals(path)) {
            System.out.println("您输入的目录已存在");
            boolean dir = file.createNewFile();
            while ( dir == true) {
                file.renameTo(new File("副本1"));  //renameTo:重命名
                System.out.println("dir = " + dir);
                System.out.println("创建副本1成功");
                break;
            }
        }*//*else if (path.equals("test_副本1.txt")){
            System.out.println("您输入的文件已存在");
            boolean file2 = file.createNewFile();创建新目录
            while (file2==true){
                file.renameTo(new File("test_副本2"));
                System.out.println("创建副本2成功");
                break;
            }
        }
    }
}*/