package com.zyl.learn.designpattern.pattern.behavioral.state;

/**
 * ClassName:HappyState
 * Package:com.zyl.learn.designpattern.pattern.behavioral.state
 * Description:
 *
 * @Date:2022/7/13 21:46
 * @Author:zhangyulong@qq.com
 */
public class HappyState extends MotherState {
    @Override
    void playWithSon() {
        System.out.println("开开心心和孩子玩耍");
    }

    @Override
    void cook() {
        System.out.println("做好吃的饭");
    }
}
