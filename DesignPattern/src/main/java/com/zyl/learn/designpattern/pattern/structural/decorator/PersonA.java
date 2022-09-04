package com.zyl.learn.designpattern.pattern.structural.decorator;

/**
 * ClassName:PersonA
 * Package:com.zyl.learn.designpattern.pattern.structural.decorator
 * Description:
 *
 * @Date:2022/6/29 16:35
 * @Author:zhangyulong@qq.com
 */
public class PersonA implements Person {
    @Override
    public void draw() {
        System.out.println("画出PersonA的轮廓");
    }
}
