package com.zyl.learn.designpattern.pattern.creational.abstractfactory.improve;

/**
 * ClassName:AbstractFactory
 * Package:com.zyl.learn.designpattern.pattern.creational.abstractfactory
 * Description:
 *
 * @Date:2022/6/27 15:05
 * @Author:zhangyulong@qq.com
 */
public abstract class AbstractFactory {
    public abstract Phone createPhone();
    public abstract Computer createComputer();
}
