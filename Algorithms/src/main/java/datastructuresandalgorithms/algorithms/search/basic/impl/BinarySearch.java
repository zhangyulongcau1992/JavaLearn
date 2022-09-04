package datastructuresandalgorithms.algorithms.search.basic.impl;


import datastructuresandalgorithms.algorithms.search.SearchInterface;
import datastructuresandalgorithms.algorithms.search.utils.SearchUtils;
import datastructuresandalgorithms.utils.CommonUtils;

/**
 * 二分查找：
 * 以升序数列为例，比较一个元素与数列中的中间位置的元素的大小，如果比中间位置的元素大，则继续在后半部分的数列中进行二分查找；
 * 如果比中间位置的元素小，则在数列的前半部分进行比较；如果相等，则找到了元素的位置。每次比较的数列长度都会是之前数列的一半，
 * 直到找到相等元素的位置或者最终没有找到要找的元素。
 * 时间复杂度：O(log2N)
 */
public class BinarySearch implements SearchInterface {
    @Override
    public boolean search(int[] arr, int value) {
        if (null == arr || arr.length == 0 || !CommonUtils.arrayInOrder(arr)) {
            return false;
        }
        int left = 0, right = arr.length-1;
        while ( left <= right ) {
            int middle = ((right - left)>>1) + left; //等价于(left + right)/2
            if (value == arr[middle]) {
                return true;
            } else if (value > arr[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SearchUtils.verify(new BinarySearch());
    }
}
