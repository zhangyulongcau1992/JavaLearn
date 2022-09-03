package com.zyl.learn.designpattern.pattern.behavioral.interpreter;

/**
 * ClassName:Expression
 * Package:com.zyl.learn.designpattern.pattern.behavioral.interpreter
 * Description:
 *
 * @Date:2022/7/13 22:12
 * @Author:zhangyulong@qq.com
 */
public interface Expression {
    boolean interpret(String context);
}
