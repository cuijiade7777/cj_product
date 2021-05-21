package com.cj.study.designpattern.singleton;

/**
 * 懒汉双重锁
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/13 2:54 下午
 */
public class Singleton4 {

    private static Singleton4 singleton4 = null;

    private Singleton4(){
    }

    public static Singleton4 getInstance(){
        if(singleton4 == null){
            synchronized (Singleton4.class){
                if(singleton4 == null){
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}
