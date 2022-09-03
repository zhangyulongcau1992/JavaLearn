package com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility;

/**
 * ClassName:Filter
 * Package:com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility
 * Description:
 *
 * @Date:2022/6/30 10:28
 * @Author:zhangyulong@qq.com
 */
public interface Filter {
    boolean doFilter(Message msg);
}
