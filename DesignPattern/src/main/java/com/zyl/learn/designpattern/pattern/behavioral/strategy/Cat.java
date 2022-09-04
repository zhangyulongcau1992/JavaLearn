package com.zyl.learn.designpattern.pattern.behavioral.strategy;

/**
 * ClassName:Cat
 * Package:com.zyl.learn.designpattern.pattern.behavioral.strategy
 * Description:
 *
 * @Date:2022/6/11 19:50
 * @Author:zhangyulong@qq.com
 */
public class Cat {
    public int weight;
    public int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
