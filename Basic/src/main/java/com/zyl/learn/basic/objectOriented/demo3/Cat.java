package com.zyl.learn.basic.objectOriented.demo3;

public class Cat extends Animal {
    public Cat(){
        System.out.println("子类构造方法执行了...");
    }
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
