package com.zyl.learn.designpattern.pattern.behavioral.visitor;

/**
 * ClassName:StudentVisitor
 * Package:com.zyl.learn.designpattern.pattern.behavioral.visitor
 * Description:
 *
 * @Date:2022/7/7 12:30
 * @Author:zhangyulong@qq.com
 */
public class StudentVisitor implements Visitor {
    double totalPrice = 0.0;
    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.8;
    }

    @Override
    public void visitMainBoard(MainBoard mainBoard) {
        totalPrice += mainBoard.getPrice() * 0.9;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.85;
    }
}
