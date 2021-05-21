package com.cj.study.designpattern.strategy.demo2;

/**
 * 选择排序
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/14 3:26 下午
 */
public class SelectionSort implements ISort {
    @Override
    public void sort(int[] arr) {
        System.out.println("===选择排序===");
        int minIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    // 记录最小值的下标
                    minIndex = j;
                }
            }
            // 将最小元素交换至首位
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
