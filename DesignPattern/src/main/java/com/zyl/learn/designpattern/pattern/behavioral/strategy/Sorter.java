package com.zyl.learn.designpattern.pattern.behavioral.strategy;

/**
 * ClassName:Sorter
 * Package:com.zyl.learn.designpattern.pattern.behavioral.strategy
 * Description:
 *
 * @Date:2022/6/11 19:41
 * @Author:zhangyulong@qq.com
 */
public class Sorter {
    public static <T extends Comparable> void sort(T[] arr) {
        if (arr == null || arr.length<2) {
            return;
        }
        int N = arr.length;
        for (int i = 0; i < N-1; i++) {
            int minPos = i;
            for (int j = i+1; j < N; j++) {
                minPos = arr[j].compareTo(arr[minPos]) < 0
                        ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    public static <T> void sort(T[] arr, Comparator<T> comparator) {
        if (arr == null || arr.length<2) {
            return;
        }
        int N = arr.length;
        for (int i = 0; i < N-1; i++) {
            int minPos = i;
            for (int j = i+1; j < N; j++) {
                minPos = comparator.compare(arr[j], arr[minPos]) < 0
                        ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    public static <T> void swap(T[] arr, int i, int j) {
        int N = arr.length;
        if (i < 0 || i >= N) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        if (j < 0 || j >= N ) {
            throw new ArrayIndexOutOfBoundsException(j);
        }
        if (i == j) {
            return;
        }

        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
