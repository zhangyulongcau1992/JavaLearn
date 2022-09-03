package com.zyl.learn.basic.objectOriented.demo4;

public class MyInterfaceImpl extends Fu implements MyInterface1,MyInterface2 {
    /*
    两个接口都有methodAbstract抽象方法，只需实现一次即可
     */
    @Override
    public void methodAbstract() {
        System.out.println("实现类实现了抽象方法...");
    }

    /*
    因为两个接口都有methodDefault默认方法，所以实现类必须重写该方法，否则报错
     */
    @Override
    public void methodDefault(){
        System.out.println("实现类重写了默认方法...");
    }
}
