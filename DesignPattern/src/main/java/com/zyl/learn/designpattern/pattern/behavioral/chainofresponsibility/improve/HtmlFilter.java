package com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility.improve;

/**
 * ClassName:HtmlFilter
 * Package:com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility.improve
 * Description:
 *
 * @Date:2022/6/30 13:57
 * @Author:zhangyulong@qq.com
 */
public class HtmlFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setRequestStr(request.getRequestStr() + "-doHtmlFilter");
        filterChain.doFilter(request, response, filterChain);
        response.setResponseStr(response.getResponseStr() + "-doHtmlFilter");
    }
}
