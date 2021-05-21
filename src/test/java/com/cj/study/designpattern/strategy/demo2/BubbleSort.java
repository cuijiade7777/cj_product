package com.cj.study.designpattern.strategy.demo2;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/14 2:47 下午
 */
public class BubbleSort implements ISort {

    @Override
    public void sort(int[] arr) {
        System.out.println("===冒泡排序===");
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<arr.length-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("=======");
        }
    }
}
