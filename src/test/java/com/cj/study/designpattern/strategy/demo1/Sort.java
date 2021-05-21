package com.cj.study.designpattern.strategy.demo1;

/**
 * 客户排序时操作的类
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/14 3:31 下午
 */
public class Sort implements ISort{

    private ISort iSort;

    public Sort(ISort iSort) {
        this.iSort = iSort;
    }

    @Override
    public void sort(int[] arr) {
        iSort.sort(arr);
    }

    public void setiSort(ISort iSort) {
        this.iSort = iSort;
    }
}
