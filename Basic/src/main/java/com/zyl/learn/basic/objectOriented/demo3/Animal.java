package com.zyl.learn.basic.objectOriented.demo3;
/*
抽象类：抽象方法所在的类，必须是抽象类才行
一个抽象类不一定含有抽象方法，只要保证抽象方法所在的类是抽象类即可，比如设计模式中的适配器模式（没有抽象方法的抽象类）
 */
public abstract class Animal {

    //抽象类中，可以有构造方法，是供子类创建对象时，初始化父类成员使用的
    public Animal(){
        System.out.println("抽象类构造方法执行了...");
    }
    //抽象方法，其中abstract不能与private、final、static一起使用，以为这三个关键词修饰的方法不能重写
    public abstract  void eat();

    public final int a;
    public static final int b;

    static{
        b = 0;
        System.out.println("抽象类的静态代码块执行了...");
    }

    {
        a=0;
        System.out.println("抽象类的构造代码块执行了...");
    }

    //普通的成员方方法
    public void commonMethod(){
        System.out.println("抽象类的普通方法执行了...");
    }

    public static void methodStatic(){
        System.out.println("抽象类的静态方法执行了...");
    }
}
