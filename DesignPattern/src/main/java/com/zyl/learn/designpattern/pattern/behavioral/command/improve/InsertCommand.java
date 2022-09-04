package com.zyl.learn.designpattern.pattern.behavioral.command.improve;

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

    public InsertCommand(Content content, CommandChain chain, String insertValue) {
        super(content, chain);
        this.insertValue = insertValue;
    }

    @Override
    public void doit() {
        content.setContentValue(content.getContentValue() + insertValue);
        chain.register(this);
        System.out.println("插入" + insertValue + "后：" + content.getContentValue());
    }

    @Override
    public void undo() {
        content.setContentValue(content.getContentValue().substring(
                0, content.getContentValue().length() - insertValue.length()));
        System.out.println("取消插入" + insertValue + "后：" + content.getContentValue());
    }
}
