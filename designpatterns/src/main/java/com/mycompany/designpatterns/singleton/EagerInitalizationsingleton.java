/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterns.singleton;

/**
 *
 * @author user
 */
public class EagerInitalizationsingleton {
    
    private static final EagerInitalizationsingleton instace = new EagerInitalizationsingleton();

    private EagerInitalizationsingleton() {
    }
    
    
    
    public static EagerInitalizationsingleton getInstance(){
        return instace;
    }
    
    public void singletonTest(){
        System.out.println("singleton method running...");
    }
    
}
