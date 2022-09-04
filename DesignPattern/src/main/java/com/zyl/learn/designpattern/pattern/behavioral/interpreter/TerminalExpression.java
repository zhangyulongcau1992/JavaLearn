package com.zyl.learn.designpattern.pattern.behavioral.interpreter;

/**
 * ClassName:TerminalExpression
 * Package:com.zyl.learn.designpattern.pattern.behavioral.interpreter
 * Description:
 *
 * @Date:2022/7/13 22:12
 * @Author:zhangyulong@qq.com
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
