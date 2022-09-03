package com.zyl.learn.designpattern.pattern.structural.decorator;

/**
 * ClassName:EyeDecorator
 * Package:com.zyl.learn.designpattern.pattern.structural.decorator
 * Description:
 *
 * @Date:2022/6/29 16:54
 * @Author:zhangyulong@qq.com
 */
public class EyesDecorator extends PersonDecorator {
    public EyesDecorator(Person person) {
        super(person);
    }

    @Override
    public void draw() {
        super.draw();
        drawEyes();
    }

    private void drawEyes() {
        System.out.println("添加眼睛");
    }
}
