package com.zyl.learn.designpattern.pattern.behavioral.visitor;

/**
 * ClassName:MainBoard
 * Package:com.zyl.learn.designpattern.pattern.behavioral.visitor
 * Description:
 *
 * @Date:2022/7/7 12:22
 * @Author:zhangyulong@qq.com
 */
public class MainBoard implements ComputerPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitMainBoard(this);
    }

    @Override
    public int getPrice() {
        return 1500;
    }
}
