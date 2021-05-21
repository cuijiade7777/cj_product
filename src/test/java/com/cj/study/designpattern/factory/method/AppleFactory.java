package com.cj.study.designpattern.factory.method;

public class AppleFactory {

    public Fruit create(){
        return new Apple();
    }
}
