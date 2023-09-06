package datastructuresandalgorithms.algorithms.sort.basic.impl;

import datastructuresandalgorithms.algorithms.sort.Sort;
import datastructuresandalgorithms.algorithms.sort.utils.SortUtils;

/**
 * 快速排序：
 * 选一个基本值，小于它的放一边，大于它的放另一边
 * 平均时间复杂度：O(N*logN)
 * 最差时间复杂度：O(N*logN)
 * 最佳时间复杂度：O(N*logN)
 * 空间复杂度：O(n)
 * 排序方式：Out-place
 * 稳定性：稳定
 */
public class MergeSort implements Sort {
    @Override
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    public void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int middle = (left + right) / 2;
        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right);
        merge(arr, left, middle, right);
    }
    public void merge(int[] arr, int left, int middle, int right) {
        int length = right - left + 1;
        int[] temp = new int[length];
        int indexLeft = left;
        int indexRight = middle + 1;
        int i = 0;
        while (indexLeft <= middle && indexRight <= right) {
            if (arr[indexLeft] <= arr[indexRight]) {
                temp[i++] = arr[indexLeft++];
            } else {
                temp[i++] = arr[indexRight++];
            }
        }
        while (indexLeft <= middle) {
            temp[i++] = arr[indexLeft++];
        }
        while (indexRight <= right) {
            temp[i++] = arr[indexRight++];
        }
        System.arraycopy(temp, 0, arr, left, length);
    }

    public static void main(String[] args) {
        SortUtils.verify(new MergeSort());
    }
}
