package com.zyl.learn.designpattern.pattern.creational.simplefactory;

/**
 * ClassName:FruitFactory
 * Package:com.zyl.learn.designpattern.pattern.creational.simplefactory
 * Description:
 *
 * @Date:2022/6/27 14:31
 * @Author:zhangyulong@qq.com
 */
public class FruitFactory {
    public static Fruit createFruit(String kind) {
        if ("apple".equals(kind)) {
            return new Apple();
        } else if ("banana".equals(kind)) {
            return new Banana();
        }
        return null;
    }
}
