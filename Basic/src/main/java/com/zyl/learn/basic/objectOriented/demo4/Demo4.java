package com.zyl.learn.basic.objectOriented.demo4;

public class Demo4 {
    public static void main(String[] args) {
        //MyInterface myInterface = new MyInterface();  //报错，接口不能实例化
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        System.out.println(myInterface.ID_NUMBER1);//1
        //System.out.println(myInterface.ID_NUMBER);//报错，两个接口都有该常量，会产生冲突
        myInterface.methodAbstract();//实现类实现了抽象方法...
        myInterface.methodDefault();//实现类重写了默认方法...
        //myInterface.methodStatic();  //报错，一个实现类有可能实现多个接口,如果实现的几个接口有同名的静态方法，会产生冲突
        MyInterface1.methodStatic();//这是接口的静态方法...

        /* 一个类如果父类中的方法，和接口中的默认方法产生了冲突，优先用父类当中的方法 */
        myInterface.method();//间接父类方法执行了...
    }
}
