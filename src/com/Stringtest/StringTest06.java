package com.Stringtest;

import java.util.Scanner;

/*
* 要求用户输入一个计算表达式，可以使用加减乘除。
* 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
* 例如:
* 1+2
* 然后经过处理计算结果并输出:1+2=3
* */
public class StringTest06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个算式:");
        //这里可以验证用户输入的是否为多次运算，已提醒用户违例
        String line = scanner.nextLine();
        //符号所在的位置
        int index = -1;
        //判断是否为加减乘除法
        //加
        if((index=line.indexOf("+"))>0){
            int number1 = parseInt(line.substring(0, index));
            int number2 = parseInt(line.substring(index+1));
            System.out.println(line+"="+(number1+number2));
            //减
        }else if((index=line.indexOf("-"))>0){
            int number1 = parseInt(line.substring(0, index));
            int number2 = parseInt(line.substring(index+1));
            System.out.println(line+"="+(number1-number2));
            //乘
        }else if((index=line.indexOf("*"))>0){
            int number1 = parseInt(line.substring(0, index));
            int number2 = parseInt(line.substring(index+1));
            System.out.println(line+"="+(number1*number2));
            //除
        }else if((index=line.indexOf("/"))>0){
            int number1 = parseInt(line.substring(0, index));
            int number2 = parseInt(line.substring(index+1));
            if(number2==0){
                System.out.println("除数不能为0");
                return;
            }
            System.out.println(line+"="+(number1/number2));
        }
    }
    /**
     * 将指定的字符串转换为数字
     * @param str
     * @return
     */
    public static int parseInt(String str){
        //最后要生成的数字
        int num = 0;
        //临时变量，用于计算对应位数的数字
        int flag = 0;
        for(int i=0;i<str.length();i++){
            flag = (str.charAt(i)-48);
            /*
             * 这里是将对应的数字计算为对应的位，例如百位数字就要用该数字乘以10的2次方
             * 得到
             * 可以用Math的相关方法处理(自行查看API文档)
             */
            for(int n=0;n<str.length()-1-i;n++){
                flag*=10;
            }
            num+=flag;
        }
        return num;
    }
}
