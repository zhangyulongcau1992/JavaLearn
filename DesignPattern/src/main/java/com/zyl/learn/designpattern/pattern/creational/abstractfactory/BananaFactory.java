package com.zyl.learn.designpattern.pattern.creational.abstractfactory;

/**
 * ClassName:BananaFactory
 * Package:com.zyl.learn.designpattern.pattern.creational.factorymethod
 * Description:
 *
 * @Date:2022/6/27 14:49
 * @Author:zhangyulong@qq.com
 */
public class BananaFactory extends AbstractFactory{
    @Override
    public Fruit create() {
        return new Banana();
    }
}
