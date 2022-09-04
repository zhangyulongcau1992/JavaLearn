package com.zyl.learn.designpattern.pattern.structural.flyweight;

import java.util.UUID;

/**
 * ClassName:Bullet
 * Package:com.zyl.learn.designpattern.pattern.structural.fly_weight
 * Description:
 *
 * @Date:2022/7/2 19:30
 * @Author:zhangyulong@qq.com
 */
public class Bullet {
    public UUID id = UUID.randomUUID();
    boolean living = true;

    @Override
    public String toString() {
        return "Bullet{" +
                "id=" + id +
                '}';
    }
}
