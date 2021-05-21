package com.cj.study.Demo1;

/**
 * 数量加或减
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/17 2:38 下午
 */
public enum SpreadNumEnum {

    ADD_1(1),
    SUB_1(-1);

    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    SpreadNumEnum(Integer value) {
        this.value = value;
    }
}
