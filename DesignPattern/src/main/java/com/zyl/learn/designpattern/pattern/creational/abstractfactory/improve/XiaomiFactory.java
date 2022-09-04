package com.zyl.learn.designpattern.pattern.creational.abstractfactory.improve;

/**
 * ClassName:XiaomiFactory
 * Package:com.zyl.learn.designpattern.pattern.creational.abstractfactory
 * Description:
 *
 * @Date:2022/6/27 15:12
 * @Author:zhangyulong@qq.com
 */
public class XiaomiFactory extends AbstractFactory {
    @Override
    public Phone createPhone() {
        return new MiPhone();
    }

    @Override
    public Computer createComputer() {
        return new MiComputer();
    }
}
