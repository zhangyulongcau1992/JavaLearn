package com.zyl.learn.designpattern.pattern.structural.decorator;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.structural.decorator
 * Description:
 *
 * @Date:2022/6/29 16:56
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        Person person = new PersonA();
        PersonDecorator personWithEyes = new EyesDecorator(person);
        PersonDecorator personWithEyesAndHair = new HairDecorator(personWithEyes);
        PersonDecorator personWithEyesAndHairAndMouth = new MouthDecorator(personWithEyesAndHair);
        personWithEyesAndHairAndMouth.draw();
    }
}
