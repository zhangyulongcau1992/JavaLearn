package com.zyl.learn.designpattern.pattern.behavioral.observer;

/**
 * ClassName:MomObserver
 * Package:com.zyl.learn.designpattern.pattern.behavioral.observer
 * Description:
 *
 * @Date:2022/6/30 20:33
 * @Author:zhangyulong@qq.com
 */
public class MomObserver implements AbstractObserver {
    @Override
    public void doSomething() {
        System.out.println("妈妈给宝宝喂奶");
    }
}
