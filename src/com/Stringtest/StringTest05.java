package com.Stringtest;

import java.util.Random;
import java.util.Scanner;

/*
* 随机生成一个5位的英文字母验证码(大小写混搭)
* 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
* 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
* */
public class StringTest05 {
    public static void main(String[] args) {
        String str = random();
        System.out.println("验证码为:" + str);
        System.out.println("把上面的验证码闪现到这里吧:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (str.toUpperCase().equals(input.toUpperCase())) {
            System.out.println("闪现过来了");
        } else {
            System.out.println("闪现老王家了");
        }

    }

    public static String random() {
        Random random = new Random();
        ////创建StringBuilder对象用于接收产生的字符
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            //调用StringBuilder对象的append()方法，将随机产生的字符添加到字符串中
            if (random.nextInt(2) == 1) {
                builder.append((char) ('a' + random.nextInt(27)));//小写字母
            } else {
                builder.append((char) ('A' + random.nextInt(27)));//大写字母
            }
        }
        return builder.toString();  //生成验证码 return
    }
}
