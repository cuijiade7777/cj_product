package com.cj.study.designpattern.singleton;

/**
 * 懒汉式单例
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/13 2:47 下午
 */
public class Singleton2 {

    private static Singleton2 singleton2 = null;

    private Singleton2(){
    }

    public static Singleton2 getInstance(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
