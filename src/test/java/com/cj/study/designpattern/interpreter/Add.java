package com.cj.study.designpattern.interpreter;

/**
 * (一句话描述该类的功能)
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/14 5:41 下午
 */
public class Add extends Operator {

    Add(Expression left, Expression right){
        super(left, right);
    }

    @Override
    public int intercept() {
        return left.intercept() + right.intercept();
    }
}
