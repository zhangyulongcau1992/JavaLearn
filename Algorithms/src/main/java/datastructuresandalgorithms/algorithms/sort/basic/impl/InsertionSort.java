package datastructuresandalgorithms.algorithms.sort.basic.impl;


import datastructuresandalgorithms.algorithms.sort.Sort;
import datastructuresandalgorithms.algorithms.sort.utils.SortUtils;

/**
 * 插入排序：
 * 1 将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
 * 2 从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。
 * 平均时间复杂度：O(N^2)
 * 最差时间复杂度：O(N^2)
 * 空间复杂度：O(1)
 * 排序方式：In-place
 * 稳定性：稳定
 */
public class InsertionSort implements Sort {
    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length<2) {
            return;
        }
        int N = arr.length;
        for (int i = 1; i < N; i++) {
            int current = arr[i];
            int j;
            for (j = i-1; j >= 0 && arr[j] > current; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = current;
        }
    }

    public static void main(String[] args) {
        SortUtils.verify(new InsertionSort());
    }
}
