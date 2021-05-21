package com.cj.study.designpattern.interpreter;

/**
 * (一句话描述该类的功能)
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/14 5:36 下午
 */
public abstract class Operator implements Expression{
    Expression left;
    Expression right;

    Operator(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
}
