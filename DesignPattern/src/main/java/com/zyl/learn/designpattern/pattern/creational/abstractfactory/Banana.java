package com.zyl.learn.designpattern.pattern.creational.abstractfactory;

/**
 * ClassName:Banana
 * Package:com.zyl.learn.designpattern.pattern.creational.simplefactory
 * Description:
 *
 * @Date:2022/6/27 14:36
 * @Author:zhangyulong@qq.com
 */
public class Banana extends Fruit {
    @Override
    public void eat() {
        System.out.println("吃香蕉");
    }
}
