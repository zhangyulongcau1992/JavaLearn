package com.zyl.learn.designpattern.pattern.behavioral.command;

/**
 * ClassName:DeleteCommand
 * Package:com.zyl.learn.designpattern.pattern.behavioral.command
 * Description:
 *
 * @Date:2022/7/13 10:33
 * @Author:zhangyulong@qq.com
 */
public class DeleteCommand extends Command {
    private int delNum;
    private String delContent;

    public DeleteCommand(Content content, int delNum) {
        super(content);
        this.delNum = delNum;
    }

    @Override
    public void doit() {
        String current = content.getContentValue();
        if (current.length() <= delNum) {
            delContent = current;
            content.setContentValue("");
            return;
        }
        delContent = current.substring(current.length() - delNum, current.length());
        content.setContentValue(current.substring(0, current.length() - delNum));
    }

    @Override
    public void undo() {
        content.setContentValue(content.getContentValue() + delContent);
    }
}
