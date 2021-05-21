package com.cj.study.designpattern.interpreter;

import org.junit.Test;

import java.util.Stack;

/**
 * (一句话描述该类的功能)
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/14 5:44 下午
 */
public class Calculator {

    int calculate(String expression) {
        Stack<Expression> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char word = expression.charAt(i);
            switch (word){
                case '加':
                    stack.push(new Add(stack.pop(), new Number(expression.charAt(++i))));
                    break;
                case '减':
                    stack.push(new Sub(stack.pop(), new Number(expression.charAt(++i))));
                    break;
                default:
                    stack.push(new Number(word));
                    break;
            }
        }
        return stack.pop().intercept();
    }
}
