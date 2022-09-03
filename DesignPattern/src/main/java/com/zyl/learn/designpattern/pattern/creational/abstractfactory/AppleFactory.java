package com.zyl.learn.designpattern.pattern.creational.abstractfactory;

/**
 * ClassName:AppleFactory
 * Package:com.zyl.learn.designpattern.pattern.creational.factorymethod
 * Description:
 *
 * @Date:2022/6/27 14:48
 * @Author:zhangyulong@qq.com
 */
public class AppleFactory extends AbstractFactory {
    @Override
    public Fruit create() {
        return new Apple();
    }
}
