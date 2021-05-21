package com.cj.study.designpattern.interpreter;

import org.junit.Test;

/**
 * (一句话描述该类的功能)
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/18 2:15 下午
 */
public class TestRes {

    @Test
    public void demo(){
        Calculator calculator = new Calculator();
        String expression1 = "一加一";
        String expression2 = "一加一加一";
        String expression3 = "二加五减三";
        String expression4 = "七减五加四减一";
        String expression5 = "九减五加三减一";
        // 输出： 一加一 等于 2
        System.out.println(expression1 + " 等于 " + calculator.calculate(expression1));
        // 输出： 一加一加一 等于 3
        System.out.println(expression2 + " 等于 " + calculator.calculate(expression2));
        // 输出： 二加五减三 等于 4
        System.out.println(expression3 + " 等于 " + calculator.calculate(expression3));
        // 输出： 七减五加四减一 等于 5
        System.out.println(expression4 + " 等于 " + calculator.calculate(expression4));
        // 输出： 九减五加三减一 等于 6
        System.out.println(expression5 + " 等于 " + calculator.calculate(expression5));
    }
}
