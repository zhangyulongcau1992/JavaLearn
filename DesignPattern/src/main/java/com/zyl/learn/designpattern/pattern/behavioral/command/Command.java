package com.zyl.learn.designpattern.pattern.behavioral.command;

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

    public Command(Content content) {
        this.content = content;
    }

    public abstract void doit();
    public abstract void undo();
}
