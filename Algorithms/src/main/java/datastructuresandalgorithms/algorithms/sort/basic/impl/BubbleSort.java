package datastructuresandalgorithms.algorithms.sort.basic.impl;


import datastructuresandalgorithms.algorithms.sort.SortInterface;
import datastructuresandalgorithms.algorithms.sort.utils.SortUtils;
import datastructuresandalgorithms.utils.CommonUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 冒泡排序：
 * 1 比较相邻的元素，如果第一个比第二个大，就交换他们两个。
 * 2 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这步做完后，最后的元素会是最大的数。
 * 3 针对所有的元素重复以上的步骤，除了最后一个。
 * 4 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * 平均时间复杂度：O(N^2)
 * 最佳时间复杂度：O(N)
 * 最差时间复杂度：O(N^2)
 * 空间复杂度：O(1)
 * 排序方式：In-place
 * 稳定性：稳定
 */
public class BubbleSort implements SortInterface {
    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length<2) {
            return;
        }
        int N = arr.length;
        for (int i = N; i > 1; i--) {
            boolean hasSwap = false;
            for (int j = 0; j < i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    CommonUtils.swap(arr, j, j+1);
                    hasSwap = true;
                }
            }
            if (!hasSwap) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        SortUtils.verify(new BubbleSort());

        List<SortInterface> list = new ArrayList<SortInterface>();
        list.add(new BubbleSort());
        list.add(new InsertionSort());
        list.add(new SelectionSort());
        SortUtils.efficiencyCompare(list);
    }

}
