package com.cj.study.designpattern.factory.abstractf;

public class AppleFactory implements IFactory{


    @Override
    public Fruit create(){
        return new Apple();
    }
}
