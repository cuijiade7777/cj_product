package com.cj.study.designpattern.strategy.demo2;

/**
 * 客户排序时操作的类
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/14 3:31 下午
 */
public class Sort implements ISort {

    private ISort iSort;

    public Sort(SortStrategy sortStrategy) {
        setStrategy(sortStrategy);
    }

    private void setStrategy(SortStrategy sortStrategy) {
        switch (sortStrategy){
            case BUBBLE_SORT:
                iSort = new BubbleSort(); break;
            case INSERT_SORT:
                iSort = new InsertSort(); break;
            case SELECTION_SORT:
                iSort = new SelectionSort(); break;
            default: throw new IllegalArgumentException("没有这个排序方式");
        }
    }

    @Override
    public void sort(int[] arr) {
        iSort.sort(arr);
    }

}
