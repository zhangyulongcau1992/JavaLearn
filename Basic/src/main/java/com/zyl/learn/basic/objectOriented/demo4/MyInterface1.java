package com.zyl.learn.basic.objectOriented.demo4;

/*
接口就是多个类的公共规范。接口不能实例化，也没有构造方法、构造代码块、静态代码块。
接口是一种引用数据类型，最重要的内容就是其中的：抽象方法。

如果是Java7，接口中可以包含的内容有：
1、常量:必须用public final static修饰，可以选择性省略
2、抽象方法:必须用public abstract修饰，可以选择性省略

如果是Java8，还可以额外包含有：
3、默认方法:必须用public default修饰，其中public可以省略
4、静态方法:必须用public statoc修饰，其中public可以省略

如果是Java9，还可以额外包含有：
5、私有方法
 */

public abstract interface MyInterface1 { //abstract为默认，可以不写
    public final static int ID_NUMBER = 0;//此处public final static可以省略

    /* 抽象方法，实现类如果不是抽象类，必须实现接口所有的抽象方法 */
    public abstract void methodAbstract();//此处public abstract可以省略

    /* 默认方法，可以解决接口升级的问题，实现类可以直接使用默认方法，也可以覆盖重写 */
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法...");
    }

    /* 静态方法，直接通过接口调用 */
    public static void methodStatic(){
        System.out.println("这是接口的静态方法...");
    }
    /* 普通私有方法，使用场景：当需要抽取一个公有方法，用来解决两个默认方法之间重复代码的问题，同时这个方法不应该让实现类使用 */
    private void methodPrivate(){

    }
    /* 静态私有方法，使用场景：当需要抽取一个公有方法，用来解决两个静态方法之间重复代码的问题，同时这个方法不应该让实现类使用 */
    private static void methodPrivateStatic(){

    }

    public default void method(){
        System.out.println("接口方法执行了");
    }

}
