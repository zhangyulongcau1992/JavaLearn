package com.zyl.learn.designpattern.pattern.behavioral.visitor;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.behavioral.visitor
 * Description:
 *
 * @Date:2022/7/7 12:31
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        StudentVisitor studentVisitor = new StudentVisitor();
        computer.accept(studentVisitor);
        System.out.println(studentVisitor.totalPrice);

        TeacherVisitor teacherVisitor = new TeacherVisitor();
        computer.accept(teacherVisitor);
        System.out.println(teacherVisitor.totalPrice);
        System.out.println("-----");
    }
}
