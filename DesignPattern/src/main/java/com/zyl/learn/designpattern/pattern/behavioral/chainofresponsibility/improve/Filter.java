package com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility.improve;

/**
 * ClassName:Filter
 * Package:com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility.improve
 * Description:
 *
 * @Date:2022/6/30 13:39
 * @Author:zhangyulong@qq.com
 */
public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}
