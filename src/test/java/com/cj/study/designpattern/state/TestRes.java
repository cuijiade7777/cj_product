package com.cj.study.designpattern.state;

import org.junit.Test;

/**
 * (一句话描述该类的功能)
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/13 8:06 下午
 */
public class TestRes {

    @Test
    public void demo1(){
        User user = new User();
        user.mockInterview();

        user.purchasePlus();
        user.mockInterview();

        user.expire();
        user.mockInterview();
    }
}
