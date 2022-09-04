package com.zyl.learn.designpattern.pattern.behavioral.observer.improve;

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
        Son son = new Son();
        son.addObserver(new MomObserver());
        son.addObserver(new DadObserver());
        son.cry();
        son.play();

        System.out.println("--------------------");

        Daughter daughter = new Daughter();
        daughter.addObserver(new MomObserver());
        daughter.addObserver(new DadObserver());
        daughter.cry();
        daughter.play();
    }
}
