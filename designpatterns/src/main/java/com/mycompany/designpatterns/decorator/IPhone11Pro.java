package com.mycompany.designpatterns.decorator;

public class IPhone11Pro extends PhoneDecorator {

    public IPhone11Pro(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice() + 100;
    }

    @Override
    public String getName() {
        return basicPhone.getName() + "11 Pro";
    }

    @Override
    public int cameraCount() {
        return super.cameraCount() + 1 ;
    }
}
