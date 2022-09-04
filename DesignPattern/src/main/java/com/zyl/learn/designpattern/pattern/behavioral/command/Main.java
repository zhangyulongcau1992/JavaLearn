package com.zyl.learn.designpattern.pattern.behavioral.command;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.behavioral.command
 * Description:
 *
 * @Date:2022/7/13 9:53
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        Content content = new Content("hello");

        Command insertCommand = new InsertCommand(content, " world");
        insertCommand.doit();
        System.out.println(content.getContentValue());
        insertCommand.undo();
        System.out.println(content.getContentValue());

        Command deleteCommand = new DeleteCommand(content, 3);
        deleteCommand.doit();
        System.out.println(content.getContentValue());
        deleteCommand.undo();
        System.out.println(content.getContentValue());
    }
}
