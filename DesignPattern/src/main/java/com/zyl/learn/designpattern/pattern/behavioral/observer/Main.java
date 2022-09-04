package com.zyl.learn.designpattern.pattern.behavioral.observer;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.behavioral.observer
 * Description:
 *
 * @Date:2022/6/30 20:39
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        Baby baby = new Baby();
        baby.addObserver(new MomObserver());
        baby.addObserver(new DadObserver());
        baby.cry();
    }
}
