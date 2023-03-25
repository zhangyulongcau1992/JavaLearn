package com.zyl.learn.basic.reflect.clazz;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Demo
 * Package:com.zyl.learn.basic.reflect.clazz
 * Description:
 *
 * @Date:2023/3/8 9:31
 * @Author:zhangyulong@qq.com
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        String[] num = new String[3];
        List<String> list = new ArrayList<>();
        System.out.println(arr.getClass().getName()); // [I
        System.out.println(num.getClass().getName()); // [Ljava.lang.String;
        System.out.println(list.getClass().getName()); // java.util.ArrayList
    }
}
