package com.mycompany.designpatterns.decorator;

public class Iphone11ProMax extends IPhone11Pro {
    public Iphone11ProMax(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName() + " Max ";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 100;
    }

    public String extraMethod() {
        return "Kirmizi ";
    }
}
