package com.zyl.learn.designpattern.pattern.structural.facade;

/**
 * ClassName:Rectangle
 * Package:com.zyl.learn.designpattern.pattern.structural.facade
 * Description:
 *
 * @Date:2022/6/29 15:34
 * @Author:zhangyulong@qq.com
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
