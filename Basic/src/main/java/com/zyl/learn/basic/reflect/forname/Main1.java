package com.zyl.learn.basic.reflect.forname;

/**
 * ClassName:Main
 * Package:com.zyl.learn.basic.reflect
 * Description:
 *
 * @Date:2022/7/11 21:48
 * @Author:zhangyulong@qq.com
 */
public class Main1 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("com.zyl.learn.basic.reflect.forname.ForName");
        System.out.println("--------------");
        ForName forName = (ForName) clazz.newInstance();
        forName.print();
    }
}
