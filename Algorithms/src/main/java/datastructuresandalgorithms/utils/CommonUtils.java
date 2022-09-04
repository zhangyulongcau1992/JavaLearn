package datastructuresandalgorithms.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:CommonUtils
 * Package:com.zyl.learn.datastructuresandalgorithms.utils
 * Description:工具类
 *
 * @Date:2022/1/27 21:10
 * @Author:zhangyulong@qq.com
 */
public class CommonUtils {

    /**
     * 交换数组arr中i位置和j位置的元素
     * @param arr
     * @param i
     * @param j
     */
    public static void swap (int[] arr, int i, int j) {
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

        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    /**
     * 返回最大长度为maxLen的数组，数组中元素取值范围是(-maxValue, maxValue]
     * @param maxLen
     * @param maxValue
     * @return
     */
    public static int[] randomArray (int maxLen, int maxValue) {
        int length = (int) (Math.random() * (maxLen + 1));
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * (maxValue + 1))
                    - (int) (Math.random() * maxValue);
        }
        return arr;
    }

    /**
     * 判断数组是否为有序数组
     * @param arr
     * @return
     */
    public static boolean arrayInOrder(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 复制一个数组
     * @param arr
     * @return
     */
    public static int[] arrayCopy(int[] arr) {
        int[] arrReturn = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrReturn[i] = arr[i];
        }
        return arrReturn;
    }

    /**
     * 数组转换为list
     * @param arr
     * @return
     */
    public static List<Integer> arrayToList(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    /**
     * list转换为数组
     * @param list
     * @return
     */
    public static int[] listToArray(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    /**
     * 判断两个数组中的元素是否都一致
     * @param arr1
     * @param arr2
     * @return
     */
    public static boolean arraySame(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

}
