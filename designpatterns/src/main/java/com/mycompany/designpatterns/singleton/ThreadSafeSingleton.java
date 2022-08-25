package com.mycompany.designpatterns.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instamce;

    private ThreadSafeSingleton(){

    }

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instamce == null){
            instamce = new ThreadSafeSingleton();
        }
        return instamce;
    }

    public void singletontest(){
        System.out.println("THreadSafe singleton running...");
    }
}
