package com.zyl.learn.designpattern.pattern.structural.bridge;

/**
 * ClassName:WarmGitf
 * Package:com.zyl.learn.designpattern.pattern.structural.bridge
 * Description:
 *
 * @Date:2022/7/12 21:34
 * @Author:zhangyulong@qq.com
 */
public class WarmGift extends Gift {
    public WarmGift(GiftImpl giftImpl) {
        this.giftImpl = giftImpl;
    }
}
