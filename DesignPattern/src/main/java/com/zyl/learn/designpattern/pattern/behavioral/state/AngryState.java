package com.zyl.learn.designpattern.pattern.behavioral.state;

/**
 * ClassName:AngryState
 * Package:com.zyl.learn.designpattern.pattern.behavioral.state
 * Description:
 *
 * @Date:2022/7/13 21:49
 * @Author:zhangyulong@qq.com
 */
public class AngryState extends MotherState {
    @Override
    void playWithSon() {
        System.out.println("不想和孩子玩");
    }

    @Override
    void cook() {
        System.out.println("让爸爸来做法");
    }
}
