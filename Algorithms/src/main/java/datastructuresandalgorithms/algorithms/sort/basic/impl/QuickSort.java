package datastructuresandalgorithms.algorithms.sort.basic.impl;

import datastructuresandalgorithms.algorithms.sort.Sort;
import datastructuresandalgorithms.algorithms.sort.utils.SortUtils;

/**
 * 快速排序：
 * 平均时间复杂度：O(N*logN)
 * 最差时间复杂度：O(N^2)
 * 最佳时间复杂度：O(N*logN)
 * 空间复杂度：O(logN)
 * 排序方式：In-place
 * 稳定性：不稳定
 */
public class QuickSort implements Sort {
    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    public void quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int baseValue = arr[l];
        int left = l, right = r;
        while (left < right) {
            //必须右边先走
            while (left < right && arr[right] >= baseValue) {
                right--;
            }
            while (left < right && arr[left] <= baseValue) {
                left++;
            }
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
        }
        arr[l] = arr[left];
        arr[left] = baseValue;

        quickSort(arr, l, left-1);
        quickSort(arr,left+1, r);
    }
    public static void main(String[] args) {
        SortUtils.verify(new QuickSort());
    }
}
