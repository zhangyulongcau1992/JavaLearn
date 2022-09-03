package com.zyl.learn.designpattern.pattern.structural.bridge;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.structural.bridge
 * Description:
 *
 * @Date:2022/7/12 21:36
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        Gift gift = new WarmGift(new Flower());
    }
}
