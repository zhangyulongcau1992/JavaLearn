package com.zyl.learn.designpattern.pattern.behavioral.strategy.extra;

/**
 * ClassName:Animal
 * Package:com.zyl.learn.designpattern.pattern.behavioral.strategy.extra
 * Description:
 *
 * @Date:2022/6/12 17:58
 * @Author:zhangyulong@qq.com
 */
public abstract class Animal {
    public int weight;
    public int height;

    public Animal(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
}
