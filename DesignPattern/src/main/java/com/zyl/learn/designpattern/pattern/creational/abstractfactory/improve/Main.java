package com.zyl.learn.designpattern.pattern.creational.abstractfactory.improve;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.creational.abstractfactory.improve
 * Description:
 *
 * @Date:2022/6/27 15:25
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new AppleFactory();
        Phone phone = factory.createPhone();
        phone.takePhotos();
        Computer computer = factory.createComputer();
        computer.study();
    }
}
