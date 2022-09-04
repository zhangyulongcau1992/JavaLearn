package com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:FilterChain
 * Package:com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility.improve
 * Description:
 *
 * @Date:2022/6/30 13:44
 * @Author:zhangyulong@qq.com
 */
public class FilterChain implements Filter{
    private List<Filter> filterList = new ArrayList<>();
    private int size = 0;

    public FilterChain add(Filter filter) {
        filterList.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if (size == filterList.size()) {
            return;
        }
        Filter filter = filterList.get(size);
        size++;
        if (filter instanceof FilterChain) {
            filter.doFilter(request, response, (FilterChain) filter);
        } else {
            filter.doFilter(request, response, filterChain);
        }
    }
}
