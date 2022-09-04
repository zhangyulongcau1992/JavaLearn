package com.zyl.learn.designpattern.pattern.behavioral.template;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.behavioral.template
 * Description:
 *
 * @Date:2022/7/13 21:25
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        Father f = new Son();
        f.doit();
    }
}
abstract class Father {
    public void doit() {
        init();
        doing();
        end();
    }
    abstract void init();
    abstract void doing();
    abstract void end();
}

class Son extends Father {

    @Override
    void init() {
        System.out.println("start");
    }

    @Override
    void doing() {
        System.out.println("doing");
    }

    @Override
    void end() {
        System.out.println("end");
    }
}
