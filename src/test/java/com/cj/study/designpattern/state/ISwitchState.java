package com.cj.study.designpattern.state;

/**
 * 状态切换
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/13 7:18 下午
 */
public interface ISwitchState {

    /**
      * 方法表示购买 Plus 会员，用户状态变为 PLUS 会员状态
      *
      * @param
      * @return void
      * @author cuijia
      * @throws
      * @date 2021/5/13 7:18 下午
      */
    void purchasePlus();


    /**
      * 方法表示会员过期，用户状态变为普通用户状态
      *
      * @param
      * @return void
      * @author cuijia
      * @throws
      * @date 2021/5/13 7:18 下午
      */
    void expire();
}
