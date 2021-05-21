package com.cj.study.designpattern.observer;

import org.junit.Test;

public class TestRes {

    @Test
    public void demo1(){
        CriminalObservable zhangsan = new CriminalObservable();
        PoliceObserver p1 = new PoliceObserver();
        PoliceObserver p2 = new PoliceObserver();
        PoliceObserver p3 = new PoliceObserver();
        zhangsan.addObserver(p1);
        zhangsan.addObserver(p2);
        zhangsan.addObserver(p3);
        zhangsan.crime("偷东西");

    }
}
