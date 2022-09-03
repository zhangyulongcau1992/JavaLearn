package com.zyl.learn.basic.objectOriented.demo4;

public interface MyInterface2 {
    public final static int ID_NUMBER = -1;//此处public final static可以省略
    public final static int ID_NUMBER1 = 1;//此处public final static可以省略

    /* 抽象方法，实现类如果不是抽象类，必须实现接口所有的抽象方法 */
    public abstract void methodAbstract();//此处public abstract可以省略

    /* 默认方法，可以解决接口升级的问题，实现类可以直接使用默认方法，也可以覆盖重写 */
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法...");
    }

    public static void methodStatic(){
        System.out.println("这是接口的静态方法...");
    }
}
