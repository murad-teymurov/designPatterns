package com.mycompany.designpatterns.singleton;

public class StaticBlockSingleton {


    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private StaticBlockSingleton(){

    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }

    public void singletonTest(){
        System.out.println("Staticblock Singleton running...");
    }
}
