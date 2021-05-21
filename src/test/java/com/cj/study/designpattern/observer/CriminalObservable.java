package com.cj.study.designpattern.observer;

/**
 * 罪犯类
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/13 6:24 下午
 */
public class CriminalObservable extends Observable{

    public void crime(String event){
        System.out.println("罪犯正在：" + event);
        notifyObservers(event);
    }
}
