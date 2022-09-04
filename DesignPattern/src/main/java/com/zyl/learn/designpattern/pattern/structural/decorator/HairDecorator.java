package com.zyl.learn.designpattern.pattern.structural.decorator;

/**
 * ClassName:HaierDecorator
 * Package:com.zyl.learn.designpattern.pattern.structural.decorator
 * Description:
 *
 * @Date:2022/6/29 16:44
 * @Author:zhangyulong@qq.com
 */
public class HairDecorator extends PersonDecorator{
    public HairDecorator(Person person) {
        super(person);
    }

    @Override
    public void draw() {
        super.draw();
        drawHair();
    }
    private void drawHair() {
        System.out.println("添加头发");
    }
}
