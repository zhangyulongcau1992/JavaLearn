package datastructuresandalgorithms.algorithms.sort.basic.impl;

import datastructuresandalgorithms.algorithms.sort.Sort;
import datastructuresandalgorithms.algorithms.sort.utils.SortUtils;

/**
 * 希尔排序：
 * 平均时间复杂度：O(N*logN)
 * 最佳时间复杂度：O(N*logN)
 * 最差时间复杂度：O(N*logN)
 * 空间复杂度：O(1)
 * 排序方式：In-place
 * 稳定性：不稳定
 */
public class ShellSort implements Sort {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int interval = n / 2; interval >= 1; interval = interval / 2) {
            for (int i = interval; i < n; i++) {
                int current = arr[i];
                int j = i - interval;
                while (j >= 0 && arr[j] > current) {
                    arr[j+interval] = arr[j];
                    j -= interval;
                }
                arr[j+interval] = current;
            }
        }
    }
    public static void main(String[] args) {
        SortUtils.verify(new ShellSort());
    }
}
