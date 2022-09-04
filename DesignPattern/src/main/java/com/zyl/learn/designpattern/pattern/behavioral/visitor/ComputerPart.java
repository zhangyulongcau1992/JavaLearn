package com.zyl.learn.designpattern.pattern.behavioral.visitor;

/**
 * ClassName:ComputerPart
 * Package:com.zyl.learn.designpattern.pattern.behavioral.visitor
 * Description:
 *
 * @Date:2022/7/7 7:26
 * @Author:zhangyulong@qq.com
 */
public interface ComputerPart {
    void accept(Visitor visitor);
    int getPrice();
}
