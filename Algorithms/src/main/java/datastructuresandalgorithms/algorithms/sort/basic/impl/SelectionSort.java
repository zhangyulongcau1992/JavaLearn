package datastructuresandalgorithms.algorithms.sort.basic.impl;


import datastructuresandalgorithms.algorithms.sort.SortInterface;
import datastructuresandalgorithms.algorithms.sort.utils.SortUtils;
import datastructuresandalgorithms.utils.CommonUtils;

/**
 * 选择排序算法：
 * 1 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
 * 2 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 3 重复第二步，直到所有元素均排序完毕。
 * 平均时间复杂度：O(N^2)
 * 最佳时间复杂度：O(N^2)
 * 最差时间复杂度：O(N^2)
 * 空间复杂度：O(1)
 * 排序方式：In-place
 * 稳定性：不稳定 [5, 5*, 2] --> [2, 5, 5*] --> [2, 5, 5*]
 */
public class SelectionSort implements SortInterface {
    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length<2) {
            return;
        }
        int N = arr.length;
        for (int i = 0; i < N-1; i++) {
            int minPos = i;
            for (int j = i+1; j < N; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            CommonUtils.swap(arr, i, minPos);
        }
    }

    public static void main(String[] args) {
        SortUtils.verify(new SelectionSort());
    }
}
