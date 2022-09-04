package com.zyl.learn.designpattern.pattern.creational.abstractfactory.improve;

/**
 * ClassName:MiPhone
 * Package:com.zyl.learn.designpattern.pattern.creational.abstractfactory
 * Description:
 *
 * @Date:2022/6/27 15:11
 * @Author:zhangyulong@qq.com
 */
public class MiPhone extends Phone {
    @Override
    public void takePhotos() {
        System.out.println("小米手机拍照");
    }
}
