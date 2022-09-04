package com.zyl.learn.designpattern.pattern.creational.abstractfactory.improve;

/**
 * ClassName:Iphone
 * Package:com.zyl.learn.designpattern.pattern.creational.abstractfactory
 * Description:
 *
 * @Date:2022/6/27 15:07
 * @Author:zhangyulong@qq.com
 */
public class IPhone extends Phone {
    @Override
    public void takePhotos() {
        System.out.println("苹果手机照相");
    }
}
