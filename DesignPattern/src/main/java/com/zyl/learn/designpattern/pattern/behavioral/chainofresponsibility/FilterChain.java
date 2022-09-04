package com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:FilterChain
 * Package:com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility
 * Description:
 *
 * @Date:2022/6/30 10:28
 * @Author:zhangyulong@qq.com
 */
public class FilterChain implements Filter {
    private List<Filter> filterList = new ArrayList<>();

    public FilterChain add(Filter filter) {
        filterList.add(filter);
        return this;
    }
    @Override
    public boolean doFilter(Message msg) {
        for (Filter filter : filterList) {
            if (!filter.doFilter(msg)) {
                return false;
            }
        }
        return true;
    }
}
