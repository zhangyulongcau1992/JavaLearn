package com.zyl.learn.designpattern.pattern.structural.bridge;

/**
 * ClassName:WildGift
 * Package:com.zyl.learn.designpattern.pattern.structural.bridge
 * Description:
 *
 * @Date:2022/7/12 21:35
 * @Author:zhangyulong@qq.com
 */
public class WildGift extends Gift {
    public WildGift(GiftImpl giftImpl) {
        this.giftImpl = giftImpl;
    }
}
