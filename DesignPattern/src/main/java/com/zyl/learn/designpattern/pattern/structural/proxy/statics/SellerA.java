package com.zyl.learn.designpattern.pattern.structural.proxy.statics;

/**
 * ClassName:Seller
 * Package:com.zyl.learn.proxy.statics.demo
 * Description:
 *
 * @Date:2022/1/19 19:56
 * @Author:zhangyulong@qq.com
 */
public class SellerA implements SellInterface {
    @Override
    public void sell() {
        System.out.println("A卖出商品");
    }
}
