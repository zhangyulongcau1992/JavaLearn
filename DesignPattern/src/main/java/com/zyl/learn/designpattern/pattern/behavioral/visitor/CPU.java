package com.zyl.learn.designpattern.pattern.behavioral.visitor;

/**
 * ClassName:CPU
 * Package:com.zyl.learn.designpattern.pattern.behavioral.visitor
 * Description:
 *
 * @Date:2022/7/7 12:20
 * @Author:zhangyulong@qq.com
 */
public class CPU implements ComputerPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCpu(this);
    }

    @Override
    public int getPrice() {
        return 2500;
    }
}
