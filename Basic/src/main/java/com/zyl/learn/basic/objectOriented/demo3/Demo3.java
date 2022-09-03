package com.zyl.learn.basic.objectOriented.demo3;

public class Demo3 {
    public static void main(String[] args) {
        //Animal animal = new Animal();  //此处报错，抽象类不能实例化
        Cat cat = new Cat();
        cat.eat();
        cat.commonMethod();
        cat.methodStatic();
    }
}
