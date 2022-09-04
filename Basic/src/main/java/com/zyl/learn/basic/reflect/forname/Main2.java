package com.zyl.learn.basic.reflect.forname;

/**
 * ClassName:Main
 * Package:com.zyl.learn.basic.reflect
 * Description:
 *
 * @Date:2022/7/11 21:51
 * @Author:zhangyulong@qq.com
 */
public class Main2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("com.zyl.learn.basic.reflect.forname.ForName", false, Main2.class.getClassLoader());
        System.out.println("--------------");
        ForName forName = (ForName) clazz.newInstance();
        forName.print();
    }
}
