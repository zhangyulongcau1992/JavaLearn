package com.zyl.learn.designpattern.pattern.structural.facade;

/**
 * ClassName:Circle
 * Package:com.zyl.learn.designpattern.pattern.structural.facade
 * Description:
 *
 * @Date:2022/6/29 15:35
 * @Author:zhangyulong@qq.com
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
