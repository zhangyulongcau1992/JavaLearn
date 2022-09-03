package com.zyl.learn.designpattern.pattern.behavioral.strategy.extra;

/**
 * ClassName:Pig
 * Package:com.zyl.learn.designpattern.pattern.behavioral.strategy.extra
 * Description:
 *
 * @Date:2022/6/12 18:01
 * @Author:zhangyulong@qq.com
 */
public class Pig extends Animal {
    public Pig(int weight, int height) {
        super(weight, height);
    }

    @Override
    public String toString() {
        return "Pig{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
