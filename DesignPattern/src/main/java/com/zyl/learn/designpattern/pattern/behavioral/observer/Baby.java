package com.zyl.learn.designpattern.pattern.behavioral.observer;

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
public class Baby {
    private List<AbstractObserver> observerList = new ArrayList<>();

    public void addObserver(AbstractObserver observer) {
        observerList.add(observer);
    }

    public void cry() {
        System.out.println("孩子哭了");
        for (AbstractObserver observer : observerList) {
            observer.doSomething();
        }
    }

}
