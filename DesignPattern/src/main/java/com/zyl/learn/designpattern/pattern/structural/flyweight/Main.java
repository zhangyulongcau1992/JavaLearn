package com.zyl.learn.designpattern.pattern.structural.flyweight;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.structural.flyweight
 * Description:
 *
 * @Date:2022/7/2 19:52
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Bullet bullet = BulletPool.getBullet();
            System.out.println(bullet);
        }
    }
}
