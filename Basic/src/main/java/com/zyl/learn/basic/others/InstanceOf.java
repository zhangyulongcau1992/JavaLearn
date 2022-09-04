package com.zyl.learn.basic.others;

/**
 * ClassName:InstanceOf
 * Package:com.zyl.learn.basic.others
 * Description:
 *
 * @Date:2022/7/11 21:43
 * @Author:zhangyulong@qq.com
 */
public class InstanceOf {
    public static void main(String[] args) {
        int[] arr = new int[0];
        if (arr instanceof int[]) {
            System.out.println("arr instanceof int[]");
        }

        if (arr.getClass().isArray()) {
            System.out.println("arr.getClass().isArray()");
        }
    }
}
