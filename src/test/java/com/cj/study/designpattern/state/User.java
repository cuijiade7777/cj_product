package com.cj.study.designpattern.state;

/**
 * 用户类
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/13 7:55 下午
 */
public class User implements IUser, ISwitchState{

    IUser state = new Normal();

    @Override
    public void mockInterview() {
        state.mockInterview();
    }

    @Override
    public void purchasePlus() {
        state = new Plus();
    }

    @Override
    public void expire() {
        state = new Normal();
    }


}
