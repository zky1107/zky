package com.Stringtest;
/*
* 检查一个字符串是否为回文
* 回文:正着念与反着念一样，例如:上海自来水来自海上
* */
public class StringTest03 {
    public static void main(String[] args) {
        /*
         * 编写一个回文字符串，然后调用check方法检查
         * 该字符串是否为回文，然后输出检查结果。
         * 若是回文则输出:是回文
         * 否则输出:不是回文
         * */
        String str = "上海自来水来自海上";
        if(check(str)){
            System.out.println("是回文");
        }else{
            System.out.println("不是回文");
        }
    }

    public static boolean check(String str){
        //charAt实现
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
