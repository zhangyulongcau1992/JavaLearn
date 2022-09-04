package com.zyl.learn.designpattern.pattern.behavioral.command.improve;

/**
 * ClassName:Command
 * Package:com.zyl.learn.designpattern.pattern.behavioral.command
 * Description:
 *
 * @Date:2022/7/13 9:47
 * @Author:zhangyulong@qq.com
 */
public abstract class Command {
    protected Content content;
    protected CommandChain chain;

    public Command(Content content, CommandChain chain) {
        this.content = content;
        this.chain = chain;
    }

    public abstract void doit();
    public abstract void undo();
}
