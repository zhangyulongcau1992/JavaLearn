package com.zyl.learn.designpattern.pattern.behavioral.command;

/**
 * ClassName:InsertCommand
 * Package:com.zyl.learn.designpattern.pattern.behavioral.command
 * Description:
 *
 * @Date:2022/7/13 9:49
 * @Author:zhangyulong@qq.com
 */
public class InsertCommand extends Command {
    String insertValue;

    public InsertCommand(Content content, String insertValue) {
        super(content);
        this.insertValue = insertValue;
    }

    @Override
    public void doit() {
        content.setContentValue(content.getContentValue() + insertValue);
    }

    @Override
    public void undo() {
        content.setContentValue(content.getContentValue().substring(
                0, content.getContentValue().length() - insertValue.length()));
    }
}
