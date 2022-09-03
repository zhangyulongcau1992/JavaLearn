package datastructuresandalgorithms.datastructures.linkedlist.utils;


import datastructuresandalgorithms.datastructures.linkedlist.LinkedListInterface;

/**
 * ClassName:LinkedListUtils
 * Package:com.zyl.learn.datastructuresandalgorithms.datastructures.linkedlist.utils
 * Description:
 *
 * @Date:2022/2/12 15:55
 * @Author:zhangyulong@qq.com
 */
public class LinkedListUtils {
    public static <T> void generateFromArray(LinkedListInterface<T> list, T[] arr) {
        if (null == arr) {
            return;
        }
        for (T item : arr) {
            list.add(item);
        }
    }
}
