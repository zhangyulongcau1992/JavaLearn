package com.zyl.learn.designpattern.pattern.behavioral.visitor;

/**
 * ClassName:Visitor
 * Package:com.zyl.learn.designpattern.pattern.behavioral.visitor
 * Description:
 *
 * @Date:2022/7/7 12:21
 * @Author:zhangyulong@qq.com
 */
public interface Visitor {
    void visitCpu(CPU cpu);
    void visitMainBoard(MainBoard mainBoard);
    void visitMemory(Memory memory);
}
