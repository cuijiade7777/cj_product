package com.cj.study.designpattern.singleton;

/**
 * 懒汉静态内部类
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/13 2:57 下午
 */
public class Singleton5 {

    private static class SingletonHolder {
        public static Singleton5 singleton5 = new Singleton5();
    }

    private Singleton5(){
    }

    public static Singleton5 getInstance(){
        return SingletonHolder.singleton5;
    }
}
