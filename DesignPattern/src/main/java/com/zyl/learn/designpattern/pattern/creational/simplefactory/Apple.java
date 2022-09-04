package com.zyl.learn.designpattern.pattern.creational.simplefactory;

/**
 * ClassName:Apple
 * Package:com.zyl.learn.designpattern.pattern.creational.simplefactory
 * Description:
 *
 * @Date:2022/6/27 14:34
 * @Author:zhangyulong@qq.com
 */
public class Apple extends Fruit {
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}
