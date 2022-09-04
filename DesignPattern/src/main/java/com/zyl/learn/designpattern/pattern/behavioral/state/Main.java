package com.zyl.learn.designpattern.pattern.behavioral.state;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.behavioral.state
 * Description:
 *
 * @Date:2022/7/13 21:50
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        Mother mother = new Mother(new AngryState());
        mother.playWithSon();
        mother.cook();
    }
}
