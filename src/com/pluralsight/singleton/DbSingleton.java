package com.pluralsight.singleton;

public class DbSingleton {
    //ToDo check volatile and also reflection class meaning

    private static volatile DbSingleton instance = null;

    private DbSingleton() {
        if (instance !=null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    // if we make whole nethod synchronised this would be a performance hit,
    public static DbSingleton getInstance(){
        if (instance == null) {
            synchronized (DbSingleton.class) {
                //once we've synchronized we need to do a null check once more since two instances may have been trying to enter this code block before they were synchronized.
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return  instance;
    }

}
