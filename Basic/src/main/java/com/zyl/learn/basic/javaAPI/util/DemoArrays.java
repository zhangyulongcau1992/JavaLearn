package com.zyl.learn.basic.javaAPI.util;

import java.util.Arrays;
/*
备注：
1、如果是数值，sort默认按照升序从小到大排序
2、如果是字符串，sort默认按照字母升序排列
3、如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持
 */
public class DemoArrays {
    public static void main(String[] args) {
        int[] intArray = {1,3,2,6,5};
        /* 1、打印方法：toString */
        System.out.println(Arrays.toString(intArray));

        /* 2、排序方法：sort */
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
