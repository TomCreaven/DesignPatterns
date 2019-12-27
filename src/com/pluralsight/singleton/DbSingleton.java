package com.pluralsight.singleton;

public class DbSingleton {

    private static DbSingleton instance = null;

    private DbSingleton() {}

    public static DbSingleton getInstance(){
        //making this lazily loaded can be a good impact on performance.
        // This is not thread safe
        if (instance == null){
            instance = new DbSingleton();
        }
        return  instance;
    }

}
