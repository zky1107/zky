package com.Stringtest;

/*
* 1:输出字符串"HelloWorld"的字符串长度
* 2:输出"HelloWorld"中"o"的位置
* 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
* 4:截取"HelloWorld"中的"Hello"并输出
* 5:截取"HelloWorld"中的"World"并输出
* 6:将字符串"  Hello   "中两边的空白去除后输出
* 7:输出"HelloWorld"中第6个字符"W"
* 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
* 9:将"HelloWorld"分别转换为全大写和全小写并输出。
* */
public class StringTest01 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        String str1 = "  Hello   ";
        test01(str);
        test02(str);
        test03(str);
        test04(str);
        test05(str);
        test06(str1);
        test07(str);
        test08(str);
        test09(str);
    }
    //调用上面test01,test02...等方法。
    //1、输出字符串"HelloWorld"的字符串长度
    public static void test01(String str){
        int m1=str.length();
        System.out.println("长度为:"+m1);
    }
    //2:输出"HelloWorld"中"o"的位置
    public static void test02(String str){
        int m2=str.indexOf('o');
        System.out.println("o的位置:"+m2);
    }
    //3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
    public static void test03(String str){
        int m3=str.indexOf('o',5);
        System.out.println("第一次出现o的位置"+m3);
    }
    //4:截取"HelloWorld"中的"Hello"并输出
    public static void test04(String str){
        String m4=str.substring(0,5);
        System.out.println("截取hello:"+m4);
    }
    //5:截取"HelloWorld"中的"World"并输出
    public static void test05(String str){
        String m5=str.substring(5);
        System.out.println("截取word:"+m5);
    }
    //6:将字符串"  Hello   "中两边的空白去除后输出
    public static void test06(String str){
        String m6=str.trim();
        System.out.println("trim:"+m6);
    }
    //7:输出"HelloWorld"中第6个字符"W"
    public static void test07(String str){
        int m7=str.charAt(5);
        System.out.println("第六个字符:"+m7);
    }
    //8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的
    public static void test08(String str){
        boolean m8=str.startsWith("h");
        boolean m9=str.endsWith("id");
        System.out.println("以h开头:"+m8);
        System.out.println("以ld结尾的:"+m9);
    }
    //9:将"HelloWorld"分别转换为全大写和全小写并输出
    public static void test09(String str){
        String m10 = str.toUpperCase();
        String m11 = str.toLowerCase();
        System.out.println("全大写:"+m10);
        System.out.println("全小写:"+m11);
    }
}
