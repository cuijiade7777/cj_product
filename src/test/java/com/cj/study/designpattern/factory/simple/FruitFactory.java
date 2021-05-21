package com.cj.study.designpattern.factory.simple;

public class FruitFactory {

    public Fruit create(String type){
        switch (type){
            case "苹果" : return new Apple();
            case "橘子" : return new Orange();
            default: throw new IllegalArgumentException("暂时没有");
        }
    }
}
