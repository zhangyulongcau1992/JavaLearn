package com.zyl.learn.designpattern.pattern.creational.simplefactory;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.creational.simplefactory
 * Description:
 *
 * @Date:2022/6/27 14:41
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        Fruit fruit = FruitFactory.createFruit("banana");
        fruit.eat();
    }
}
