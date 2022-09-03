package com.zyl.learn.basic.objectOriented.demo1;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(Student.school);
        Student stu1 = new Student("张三",17);
        Student stu2 = new Student("李四",16);
        Student stu3 = new Student("王五",16);
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);
    }
}
