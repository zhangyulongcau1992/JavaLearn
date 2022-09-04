package com.zyl.learn.basic.objectOriented.demo1;

public class Student {
    private int id;
    private String name;
    private int age;
    public static String school;
    private static int idCounter;

    //类加载的时候执行
    static{
        idCounter = 0;
        school = "清华大学";
        System.out.println("静态代码块执行了...");
        System.out.println("静态代码块可以间接访问非静态成员，比如年龄："+new Student().age);
    }

    //每次生成对象时执行该部分代码
    {
        id = idCounter++;;
        System.out.println("构造代码块执行了...");
    }

    public Student() {
        System.out.println("无参构造函数执行了...");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造函数执行了...");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
