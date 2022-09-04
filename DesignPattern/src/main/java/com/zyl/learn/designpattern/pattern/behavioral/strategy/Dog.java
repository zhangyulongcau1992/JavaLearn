package com.zyl.learn.designpattern.pattern.behavioral.strategy;

/**
 * ClassName:Dog
 * Package:com.zyl.learn.designpattern.pattern.behavioral.strategy
 * Description:
 *
 * @Date:2022/6/12 17:52
 * @Author:zhangyulong@qq.com
 */
public class Dog implements Comparable<Dog> {
    public int weight;
    public int height;

    public Dog(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int compareTo(Dog o) {
        if (null == o) {
            return 1;
        }
        if (this.weight > o.weight) {
            return 1;
        } else if (this.weight < o.weight) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
