package com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility
 * Description:
 *
 * @Date:2022/6/30 10:27
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        Message msg = new Message("张彧龙，男，30岁 <html>，上班996");

        FilterChain chain1 = new FilterChain();
        chain1.add(new NameFilter()).add(new SexFilter());

        FilterChain chain2 = new FilterChain();
        chain2.add(new SensitiveFilter()).add(new HTMLFilter());

        chain1.add(chain2);
        chain1.doFilter(msg);
        System.out.println(msg.getMsgStr());
    }
}
