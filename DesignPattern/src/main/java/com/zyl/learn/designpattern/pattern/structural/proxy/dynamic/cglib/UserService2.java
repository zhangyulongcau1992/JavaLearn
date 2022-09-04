package com.zyl.learn.designpattern.pattern.structural.proxy.dynamic.cglib;

/**
 * ClassName:UserService2
 * Package:com.zyl.learn.designpattern.pattern.structural.proxy.dynamic.cglib
 * Description:
 *
 * @Date:2022/7/3 21:30
 * @Author:zhangyulong@qq.com
 */
public class UserService2 implements UserInterface {
    @Override
    public void test() {
        System.out.println("test2");
    }
}
