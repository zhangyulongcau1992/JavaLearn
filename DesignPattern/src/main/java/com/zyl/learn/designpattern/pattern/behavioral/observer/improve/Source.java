package com.zyl.learn.designpattern.pattern.behavioral.observer.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Source
 * Package:com.zyl.learn.designpattern.pattern.behavioral.observer
 * Description:
 *
 * @Date:2022/6/30 21:48
 * @Author:zhangyulong@qq.com
 */
public abstract class Source {
    protected List<AbstractObserver> observerList = new ArrayList<>();

    public void addObserver(AbstractObserver observer) {
        observerList.add(observer);
    }
}
