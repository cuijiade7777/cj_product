package com.cj.study.designpattern.iterator;

import org.junit.Test;

/**
 * (一句话描述该类的功能)
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/18 2:44 下午
 */
public class TestRes {

    @Test
    public void demo1(){
        MyList list = new MyList();
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
