package com.mycompany.designpatterns.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    public void singletonTest(){
        System.out.println("LAzy singleton running...");

    }
}
