package com.zyl.learn.designpattern.pattern.structural.facade;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.structural.facade
 * Description:
 *
 * @Date:2022/6/29 15:40
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawMoney();
    }
}
