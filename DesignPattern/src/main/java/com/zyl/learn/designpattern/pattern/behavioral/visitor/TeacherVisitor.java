package com.zyl.learn.designpattern.pattern.behavioral.visitor;

/**
 * ClassName:TeacherVisitor
 * Package:com.zyl.learn.designpattern.pattern.behavioral.visitor
 * Description:
 *
 * @Date:2022/7/7 12:31
 * @Author:zhangyulong@qq.com
 */
public class TeacherVisitor implements Visitor {
    double totalPrice = 0.0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.7;
    }

    @Override
    public void visitMainBoard(MainBoard mainBoard) {
        totalPrice += mainBoard.getPrice() * 0.8;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.75;
    }
}
