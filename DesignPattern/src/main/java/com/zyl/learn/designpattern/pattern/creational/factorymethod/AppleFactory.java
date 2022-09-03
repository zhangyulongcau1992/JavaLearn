package com.zyl.learn.designpattern.pattern.creational.factorymethod;

/**
 * ClassName:AppleFactory
 * Package:com.zyl.learn.designpattern.pattern.creational.factorymethod
 * Description:
 *
 * @Date:2022/6/27 14:48
 * @Author:zhangyulong@qq.com
 */
public class AppleFactory {
    public static Fruit create() {
        return new Apple();
    }
}
