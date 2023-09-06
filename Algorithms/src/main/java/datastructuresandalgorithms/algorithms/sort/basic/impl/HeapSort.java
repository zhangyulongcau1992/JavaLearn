package datastructuresandalgorithms.algorithms.sort.basic.impl;

import datastructuresandalgorithms.algorithms.sort.Sort;
import datastructuresandalgorithms.algorithms.sort.utils.SortUtils;

/**
 * 堆排序：
 * 平均时间复杂度：O(N*logN)
 * 最差时间复杂度：O(N*logN)
 * 最佳时间复杂度：O(N*logN)
 * 空间复杂度：O(1)
 * 排序方式：In-place
 * 稳定性：不稳定
 */
public class HeapSort implements Sort {
    @Override
    public void sort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            sift(arr, i, arr.length);
        }
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            sift(arr, 0, i);
        }
    }
    private void sift(int[] arr, int parent, int len)
    {
        int value = arr[parent];
        for (int child = 2 * parent + 1; child < len; child = child * 2 + 1) {
            if(child + 1 < len && arr[child+1] > arr[child]){
                child++;
            }
            if(arr[child] > value) {
                arr[parent] = arr[child];
                parent = child;
            } else {
                break;
            }
        }
        arr[parent] = value;
    }
    public static void main(String[] args) {
        SortUtils.verify(new HeapSort());
    }
}
