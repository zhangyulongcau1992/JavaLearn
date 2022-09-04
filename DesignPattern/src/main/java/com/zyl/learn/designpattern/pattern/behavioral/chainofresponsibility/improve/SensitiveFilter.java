package com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility.improve;

/**
 * ClassName:SensitiveFilter
 * Package:com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility.improve
 * Description:
 *
 * @Date:2022/6/30 13:58
 * @Author:zhangyulong@qq.com
 */
public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setRequestStr(request.getRequestStr() + "-doSensitiveFilter");
        filterChain.doFilter(request, response, filterChain);
        response.setResponseStr(response.getResponseStr() + "-doSensitiveFilter");
    }
}
