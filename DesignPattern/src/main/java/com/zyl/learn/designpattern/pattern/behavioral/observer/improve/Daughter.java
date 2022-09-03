package com.zyl.learn.designpattern.pattern.behavioral.observer.improve;

/**
 * ClassName:Daughter
 * Package:com.zyl.learn.designpattern.pattern.behavioral.observer.improve
 * Description:
 *
 * @Date:2022/6/30 22:12
 * @Author:zhangyulong@qq.com
 */
public class Daughter extends Source {
    public void cry() {
        System.out.println("女儿哭了");
        for (AbstractObserver observer : observerList) {
            observer.doSomething(new CryEvent(this));
        }
    }

    public void play() {
        System.out.println("女儿要出去玩");
        for (AbstractObserver observer : observerList) {
            observer.doSomething(new PlayEvent(this));
        }
    }
}
