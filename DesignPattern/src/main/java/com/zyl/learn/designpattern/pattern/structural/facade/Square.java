package com.zyl.learn.designpattern.pattern.structural.facade;

/**
 * ClassName:Square
 * Package:com.zyl.learn.designpattern.pattern.structural.facade
 * Description:
 *
 * @Date:2022/6/29 15:36
 * @Author:zhangyulong@qq.com
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
