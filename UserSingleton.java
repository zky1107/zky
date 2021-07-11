package com.zky;

public class UserSingleton {
    private static UserSingleton ourInstance = new UserSingleton();

    public static UserSingleton getInstance() {

        return ourInstance;
    }

    private UserSingleton() {
    }
}
