package com.cj.study.designpattern.state;

/**
 * (一句话描述该类的功能)
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/13 8:03 下午
 */
public class Normal implements IUser{
    @Override
    public void mockInterview() {
        System.out.println("模拟面试是 Plus 会员专享功能");
    }
}
