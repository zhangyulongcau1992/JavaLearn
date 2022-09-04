package com.zyl.learn.designpattern.pattern.creational.factorymethod;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.creational.factorymethod
 * Description:
 *
 * @Date:2022/6/27 14:49
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        Fruit fruit = AppleFactory.create();
        fruit.eat();
    }
}
