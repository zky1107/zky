package com.zky;

public class User {
    public static void main(String[] args) {
        UserSingleton us1 = UserSingleton.getInstance();
        UserSingleton us2 = UserSingleton.getInstance();
        System.out.println(us1 == us2);


    }
}
