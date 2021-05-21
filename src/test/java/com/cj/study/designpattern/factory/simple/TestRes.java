package com.cj.study.designpattern.factory.simple;

import org.junit.Test;

public class TestRes {

    @Test
    public void demo1(){
        FruitFactory factory = new FruitFactory();
        Fruit apple = factory.create("苹果");
        Fruit orangle = factory.create("橘子");
        apple.eat();
        orangle.eat();
    }
}
