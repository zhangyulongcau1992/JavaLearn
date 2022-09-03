package com.zyl.learn.designpattern.pattern.behavioral.visitor;

/**
 * ClassName:Computer
 * Package:com.zyl.learn.designpattern.pattern.behavioral.visitor
 * Description:
 *
 * @Date:2022/7/7 7:26
 * @Author:zhangyulong@qq.com
 */
public class Computer {
    private ComputerPart cpu = new CPU();
    private ComputerPart memory = new Memory();
    private ComputerPart mainBoard = new MainBoard();

    void accept(Visitor visitor) {
        cpu.accept(visitor);
        memory.accept(visitor);
        mainBoard.accept(visitor);
    }
}
