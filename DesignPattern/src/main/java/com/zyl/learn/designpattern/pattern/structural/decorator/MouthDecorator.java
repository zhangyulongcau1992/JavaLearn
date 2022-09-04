package com.zyl.learn.designpattern.pattern.structural.decorator;

/**
 * ClassName:MouthDecorator
 * Package:com.zyl.learn.designpattern.pattern.structural.decorator
 * Description:
 *
 * @Date:2022/6/29 17:13
 * @Author:zhangyulong@qq.com
 */
public class MouthDecorator extends PersonDecorator {
    public MouthDecorator(Person person) {
        super(person);
    }

    @Override
    public void draw() {
        super.draw();
        drawMouth();
    }

    private void drawMouth() {
        System.out.println("添加嘴巴");
    }
}
