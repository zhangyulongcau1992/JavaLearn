package com.zyl.learn.designpattern.pattern.creational.factorymethod;

/**
 * ClassName:BananaFactory
 * Package:com.zyl.learn.designpattern.pattern.creational.factorymethod
 * Description:
 *
 * @Date:2022/6/27 14:49
 * @Author:zhangyulong@qq.com
 */
public class BananaFactory {
    public static Fruit create() {
        return new Banana();
    }
}
