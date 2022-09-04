package com.zyl.learn.designpattern.pattern.behavioral.command.improve;

import java.util.ArrayList;
import java.util.List;

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
    private List<String> delContent = new ArrayList<>();

    public DeleteCommand(Content content, CommandChain chain, int delNum) {
        super(content, chain);
        this.delNum = delNum;
    }

    @Override
    public void doit() {
        String current = content.getContentValue();
        if (current.length() <= delNum) {
            delContent.add(current);
            content.setContentValue("");
        } else {
            delContent.add(current.substring(current.length() - delNum, current.length()));
            content.setContentValue(current.substring(0, current.length() - delNum));
        }
        chain.register(this);
        System.out.println("删除" + delNum + "字母：" + content.getContentValue());
    }

    @Override
    public void undo() {
        if (delContent.size() > 0) {
            String lastRemove = delContent.get(delContent.size() - 1);
            content.setContentValue(content.getContentValue() + lastRemove);
            delContent.remove(delContent.size() - 1);
            System.out.println("取消删除" + delNum + "字母：" + content.getContentValue());
        }
    }
}
