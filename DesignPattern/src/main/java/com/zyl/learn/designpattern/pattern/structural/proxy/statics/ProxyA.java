package com.zyl.learn.designpattern.pattern.structural.proxy.statics;

/**
 * ClassName:ProxySeller
 * Package:com.zyl.learn.proxy.statics.demo
 * Description:
 *
 * @Date:2022/1/19 19:58
 * @Author:zhangyulong@qq.com
 */
public class ProxyA implements SellInterface {
    private SellerA seller = new SellerA();
    @Override
    public void sell() {
        System.out.println("代理帮忙卖东西");
        seller.sell();
        System.out.println("代理收取代理费");
    }
}
