package com.Stringtest;

import java.util.Scanner;

/*
* 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
* */
public class StringTest04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("动动您的小手输入一个email地址:");
        String email = scanner.nextLine();
        if(email.indexOf("@")<1){
            System.out.println("您再看看是否缺少@或没有用户名");
        }else{
            String username = email.substring(0, email.indexOf("@"));
            System.out.println("用户名:"+username);
        }
    }
}
