package com.zyl.learn.designpattern.pattern.behavioral.observer;

/**
 * ClassName:DadObserver
 * Package:com.zyl.learn.designpattern.pattern.behavioral.observer
 * Description:
 *
 * @Date:2022/6/30 20:33
 * @Author:zhangyulong@qq.com
 */
public class DadObserver implements AbstractObserver {
    @Override
    public void doSomething() {
        System.out.println("爸爸安抚宝宝睡觉");
    }
}
