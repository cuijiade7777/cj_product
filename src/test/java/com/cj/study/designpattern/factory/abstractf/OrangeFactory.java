package com.cj.study.designpattern.factory.abstractf;

public class OrangeFactory implements IFactory{

    @Override
    public Fruit create(){
        return new Orange();
    }
}
