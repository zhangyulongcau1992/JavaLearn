package com.zyl.learn.designpattern.pattern.behavioral.observer.improve;

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
    public void doSomething(Event e) {
        if (e instanceof CryEvent) {
            if (e.getSource() instanceof Son) {
                System.out.println("妈妈安抚儿子睡觉");
            } else if (e.getSource() instanceof Daughter) {
                System.out.println("妈妈安抚女儿睡觉");
            }
        } else if (e instanceof PlayEvent) {
            if (e.getSource() instanceof Son) {
                System.out.println("妈妈看护儿子玩");
            }
            if (e.getSource() instanceof Daughter) {
                System.out.println("妈妈看护女儿玩");
            }
        }
    }
}
