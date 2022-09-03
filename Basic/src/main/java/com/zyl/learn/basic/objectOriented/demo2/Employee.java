package com.zyl.learn.basic.objectOriented.demo2;

//定义员工父类
public class Employee extends Person {
    private String name;
    private int age;
    public int id = 0;

    static {
        System.out.println("父类静态代码块执行了...");
    }
    {
        System.out.println("父类构造代码块执行了...");
    }
    public Employee(){
        System.out.println("父类无参构造函数执行了...");
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类有参构造函数执行了...");
    }

    public void method(){
        System.out.println("父类method方法执行了...");
    }

    public static void staticMethod(){
        System.out.println("父类静态方法执行了...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
