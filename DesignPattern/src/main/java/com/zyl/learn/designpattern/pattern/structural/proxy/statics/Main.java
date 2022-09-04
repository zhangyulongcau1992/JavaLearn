package com.zyl.learn.designpattern.pattern.structural.proxy.statics;

/**
 * ClassName:Client
 * Package:com.zyl.learn.proxy.statics.demo
 * Description:
 *
 * @Date:2022/1/19 20:02
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        SellInterface proxyA = new ProxyA();
        proxyA.sell();

        System.out.println();

        SellInterface proxyB = new ProxyB();
        proxyB.sell();
    }
}
