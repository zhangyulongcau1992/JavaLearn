package com.zyl.learn.designpattern.pattern.behavioral.command.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:CommandChain
 * Package:com.zyl.learn.designpattern.pattern.behavioral.command.improve
 * Description:
 *
 * @Date:2022/7/13 10:45
 * @Author:zhangyulong@qq.com
 */
public class CommandChain {
    private List<Command> commandList = new ArrayList<>();
    private List<Command> removedList = new ArrayList<>();

    public void register(Command command) {
        commandList.add(command);
    }

    public CommandChain undo() {
        if (commandList.size() > 0) {
            int lastIndex = commandList.size() - 1;
            commandList.get(lastIndex).undo();
            Command command = commandList.remove(lastIndex);
            removedList.add(command);
        }
        return this;
    }

    public CommandChain redo() {
        if (removedList.size() > 0) {
            int lastIndex = removedList.size() - 1;
            removedList.get(lastIndex).doit();
            Command command = removedList.remove(lastIndex);
            commandList.add(command);
        }
        return this;
    }
}
