package com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility.improve;

/**
 * 模拟 javax.servlet.Filter 和 javax.servlet.FilterChain 功能
 */
public class Main {
    public static void main(String[] args) {
        Request request = new Request("request");
        Response response = new Response("response");

        FilterChain chain1 = new FilterChain();
        chain1.add(new HtmlFilter()).add(new SensitiveFilter());
        FilterChain chain2 = new FilterChain();
        chain2.add(new NameFilter()).add(new SexFilter());
        chain1.add(chain2);
        chain1.doFilter(request, response, chain1);

        System.out.println(request.getRequestStr());
        System.out.println(response.getResponseStr());
    }
}
