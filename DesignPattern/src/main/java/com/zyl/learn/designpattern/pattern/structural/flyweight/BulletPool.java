package com.zyl.learn.designpattern.pattern.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:BulletPool
 * Package:com.zyl.learn.designpattern.pattern.structural.fly_weight
 * Description:
 *
 * @Date:2022/7/2 19:31
 * @Author:zhangyulong@qq.com
 */
public class BulletPool {
    static List<Bullet> bullets = new ArrayList<>();
    static {
        for (int i = 0; i < 5; i++) {
            bullets.add(new Bullet());
        }
    }

    public static Bullet getBullet() {
        for (Bullet bullet : bullets) {
            if (bullet.living) {
                return bullet;
            }
        }
        return new Bullet();
    }

}
