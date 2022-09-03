package com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility.improve;

/**
 * ClassName:NameFilter
 * Package:com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility.improve
 * Description:
 *
 * @Date:2022/6/30 14:10
 * @Author:zhangyulong@qq.com
 */
public class NameFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setRequestStr(request.getRequestStr() + "-doNameFilter");
        filterChain.doFilter(request, response, filterChain);
        response.setResponseStr(response.getResponseStr() + "-doNameFilter");
    }
}
