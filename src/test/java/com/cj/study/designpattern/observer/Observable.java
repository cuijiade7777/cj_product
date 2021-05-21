package com.cj.study.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者父类
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/13 6:19 下午
 */
public class Observable {

    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObservers(String event){
        for (Observer observer : observerList) {
            observer.update(event);
        }
    }

}
