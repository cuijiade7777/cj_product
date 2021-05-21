package com.cj.study.designpattern.singleton;

/**
 * 饿汉式单例
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/13 2:45 下午
 */
public class Singleton1 {

    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance(){
        return singleton1;
    }
}
