package com.zyl.learn.designpattern.pattern.structural.decorator;

/**
 * ClassName:PersonDecorator
 * Package:com.zyl.learn.designpattern.pattern.structural.decorator
 * Description:
 *
 * @Date:2022/6/29 16:37
 * @Author:zhangyulong@qq.com
 */
public class PersonDecorator implements Person {
    private Person person;
    public PersonDecorator(Person person) {
        this.person = person;
    }

    @Override
    public void draw() {
        person.draw();
    }
}
