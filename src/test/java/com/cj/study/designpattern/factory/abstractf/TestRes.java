package com.cj.study.designpattern.factory.abstractf;

import org.junit.Test;

public class TestRes {

    @Test
    public void demo1(){
        IFactory iFactory = new AppleFactory();
        Fruit fruit = iFactory.create();
        fruit.eat();

        IFactory iFactory1 = new OrangeFactory();
        Fruit fruit1 = iFactory1.create();
        fruit1.eat();
    }
}
