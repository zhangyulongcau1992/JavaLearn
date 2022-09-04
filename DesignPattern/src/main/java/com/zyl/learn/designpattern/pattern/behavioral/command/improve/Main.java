package com.zyl.learn.designpattern.pattern.behavioral.command.improve;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.behavioral.command.improve
 * Description:
 *
 * @Date:2022/7/13 10:43
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        CommandChain chain = new CommandChain();
        Content content = new Content("hello");
        Command insertCommand = new InsertCommand(content, chain, "world");
        Command deleteCommand = new DeleteCommand(content, chain, 3);

        insertCommand.doit();
        deleteCommand.doit();
        insertCommand.doit();
        insertCommand.doit();
        deleteCommand.doit();
        deleteCommand.doit();
        chain.undo();
        chain.undo();
        chain.undo();
        chain.redo();
        chain.redo();
    }
}
