package com.cj.study.designpattern.factory.method;

public class OrangeFactory {

    public Fruit create(){
        return new Orange();
    }
}
