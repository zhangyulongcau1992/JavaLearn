package com.zyl.learn.designpattern.pattern.structural.proxy.dynamic.jdk;

/**
 * ClassName:UserService
 * Package:com.zyl.learn.proxy.dynamic.jdk.demo
 * Description:
 *
 * @Date:2022/1/19 18:36
 * @Author:zhangyulong@qq.com
 */
public class UserService implements UserInterface{
    @Override
    public void test() {
        System.out.println("test");
    }
}
