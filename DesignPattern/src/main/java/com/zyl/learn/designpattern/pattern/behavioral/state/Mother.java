package com.zyl.learn.designpattern.pattern.behavioral.state;

/**
 * ClassName:Mother
 * Package:com.zyl.learn.designpattern.pattern.behavioral.state
 * Description:
 *
 * @Date:2022/7/13 21:47
 * @Author:zhangyulong@qq.com
 */
public class Mother {
    MotherState state;

    public Mother(MotherState state) {
        this.state = state;
    }

    void playWithSon() {
        state.playWithSon();
    }

    void cook() {
        state.cook();
    }
}
