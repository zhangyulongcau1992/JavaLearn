package com.zyl.learn.designpattern.pattern.behavioral.observer.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Baby
 * Package:com.zyl.learn.designpattern.pattern.behavioral.observer
 * Description:
 *
 * @Date:2022/6/30 20:36
 * @Author:zhangyulong@qq.com
 */
public class Son extends Source {

    public void cry() {
        System.out.println("儿子哭了");
        for (AbstractObserver observer : observerList) {
            observer.doSomething(new CryEvent(this));
        }
    }

    public void play() {
        System.out.println("儿子要出去玩");
        for (AbstractObserver observer : observerList) {
            observer.doSomething(new PlayEvent(this));
        }
    }
}
