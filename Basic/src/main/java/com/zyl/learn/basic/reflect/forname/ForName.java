package com.zyl.learn.basic.reflect.forname;

/**
 * ClassName:ForName
 * Package:com.zyl.learn.basic.reflect
 * Description:
 *
 * @Date:2022/7/11 21:45
 * @Author:zhangyulong@qq.com
 */
public class ForName {
    static int a1 = 10;

    static {
        int a2 = 15;
        System.out.println("a1=" + a1);
        System.out.println("a2=" + a2);
    }

    public void print() {
        System.out.println("print");
    }
}