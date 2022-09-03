package com.zyl.learn.designpattern.pattern.behavioral.visitor;

/**
 * ClassName:Memary
 * Package:com.zyl.learn.designpattern.pattern.behavioral.visitor
 * Description:
 *
 * @Date:2022/7/7 12:22
 * @Author:zhangyulong@qq.com
 */
public class Memory implements ComputerPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitMemory(this);
    }

    @Override
    public int getPrice() {
        return 500;
    }
}
