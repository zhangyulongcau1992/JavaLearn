package com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility.improve;

/**
 * ClassName:SexFilter
 * Package:com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility.improve
 * Description:
 *
 * @Date:2022/6/30 14:11
 * @Author:zhangyulong@qq.com
 */
public class SexFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setRequestStr(request.getRequestStr() + "-doSexFilter");
        filterChain.doFilter(request, response, filterChain);
        response.setResponseStr(response.getResponseStr() + "-doSexFilter");
    }
}
