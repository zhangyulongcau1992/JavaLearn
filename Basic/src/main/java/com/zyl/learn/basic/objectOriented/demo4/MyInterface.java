package com.zyl.learn.basic.objectOriented.demo4;

public interface MyInterface extends MyInterface1,MyInterface2{

    //因为其两个父接口都有methodDefault的默认方法，所以本接口类必须重写该方法,并必须用default关键字修饰，否则报错
    @Override
    default void methodDefault() {

    }
}
