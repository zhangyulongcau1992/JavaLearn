package com.zyl.learn.designpattern.pattern.structural.proxy.statics;

/**
 * ClassName:ProxyB
 * Package:com.zyl.learn.proxy.statics.demo
 * Description:
 *
 * @Date:2022/1/19 20:26
 * @Author:zhangyulong@qq.com
 */
public class ProxyB implements SellInterface {
    private SellerB seller = new SellerB();
    @Override
    public void sell() {
        System.out.println("代理帮忙卖东西");
        seller.sell();
        System.out.println("代理收取代理费");
    }
}
