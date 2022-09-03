package com.zyl.learn.designpattern.pattern.creational.abstractfactory.improve;

/**
 * ClassName:AppleFactory
 * Package:com.zyl.learn.designpattern.pattern.creational.abstractfactory
 * Description:
 *
 * @Date:2022/6/27 15:09
 * @Author:zhangyulong@qq.com
 */
public class AppleFactory extends AbstractFactory {
    @Override
    public Phone createPhone() {
        return new IPhone();
    }

    @Override
    public Computer createComputer() {
        return new IMac();
    }
}
