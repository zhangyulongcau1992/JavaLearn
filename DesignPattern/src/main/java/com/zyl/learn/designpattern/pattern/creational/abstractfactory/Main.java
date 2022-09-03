package com.zyl.learn.designpattern.pattern.creational.abstractfactory;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.creational.abstractfactory
 * Description:
 *
 * @Date:2022/6/27 15:27
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new AppleFactory();
        Fruit fruit = factory.create();
        fruit.eat();
    }
}
