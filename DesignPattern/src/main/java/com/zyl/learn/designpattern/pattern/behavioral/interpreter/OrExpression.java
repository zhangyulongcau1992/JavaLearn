package com.zyl.learn.designpattern.pattern.behavioral.interpreter;

/**
 * ClassName:OrExpression
 * Package:com.zyl.learn.designpattern.pattern.behavioral.interpreter
 * Description:
 *
 * @Date:2022/7/13 22:12
 * @Author:zhangyulong@qq.com
 */
public class OrExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
