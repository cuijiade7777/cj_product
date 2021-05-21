package com.cj.study.designpattern.strategy.demo2;

/**
 * 插入排序
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/14 3:27 下午
 */
public class InsertSort implements ISort {
    @Override
    public void sort(int[] arr) {
        System.out.println("===插入排序===");
        // 从第二个数开始，往前插入数字
        for (int i = 1; i < arr.length; i++) {
            int currentNumber = arr[i];
            int j = i - 1;
            // 寻找插入位置的过程中，不断地将比 currentNumber 大的数字向后挪
            while (j >= 0 && currentNumber < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // 两种情况会跳出循环：1. 遇到一个小于或等于 currentNumber 的数字，跳出循环，currentNumber 就坐到它后面。
            // 2. 已经走到数列头部，仍然没有遇到小于或等于 currentNumber 的数字，也会跳出循环，此时 j 等于 -1，currentNumber 就坐到数列头部。
            arr[j + 1] = currentNumber;
        }
    }
}
