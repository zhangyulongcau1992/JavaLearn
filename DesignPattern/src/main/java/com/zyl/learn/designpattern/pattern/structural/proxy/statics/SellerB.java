package com.zyl.learn.designpattern.pattern.structural.proxy.statics;

/**
 * ClassName:SellerB
 * Package:com.zyl.learn.proxy.statics.demo
 * Description:
 *
 * @Date:2022/1/19 20:15
 * @Author:zhangyulong@qq.com
 */
public class SellerB implements SellInterface{
    @Override
    public void sell() {
        System.out.println("B卖出商品");
    }
}
