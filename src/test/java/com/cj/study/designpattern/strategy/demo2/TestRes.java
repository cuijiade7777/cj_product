package com.cj.study.designpattern.strategy.demo2;

import org.junit.Test;

import java.util.Arrays;

/**
 * (一句话描述该类的功能)
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/14 3:00 下午
 */
public class TestRes {

    @Test
    public void demo1(){
        int[] arr = {4,3,5,1,2,6,3};
        // 如果客户不进行选择，默认冒泡排序
//        Sort sort = new Sort(SortStrategy.BUBBLE_SORT);
//        Sort sort = new Sort(SortStrategy.SELECTION_SORT);
        Sort sort = new Sort(SortStrategy.INSERT_SORT);

        sort.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
