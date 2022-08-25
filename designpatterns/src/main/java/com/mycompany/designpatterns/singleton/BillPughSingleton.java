package com.mycompany.designpatterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton(){

    }

    public static BillPughSingleton getInstance(){
            return SingletonHelper.instance;
    }

    public void singletonTest(){
        System.out.println("Bill Pugh Singleton runnig...");
    }

    private static class SingletonHelper{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }
}
