package com.cj.study.designpattern.observer;

/**
 * 警察观察者
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/13 6:13 下午
 */
public class PoliceObserver implements Observer{
    @Override
    public void update(String event) {
        System.out.println("警察发现小偷进行了：" + event);
    }
}
