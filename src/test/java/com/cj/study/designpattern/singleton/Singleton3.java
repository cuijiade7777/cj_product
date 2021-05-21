package com.cj.study.designpattern.singleton;

/**
 * 懒汉式加锁
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/13 2:51 下午
 */
public class Singleton3 {

    private static Singleton3 singleton3 = null;

    private Singleton3(){
    }

    public static Singleton3 getInstance(){
        synchronized (Singleton3.class){
            if(singleton3 == null){
                singleton3 = new Singleton3();
            }
        }
        return singleton3;
    }
}
