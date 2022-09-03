package com.zyl.learn.designpattern.pattern.behavioral.strategy.extra;

/**
 * ClassName:Comparator
 * Package:com.zyl.learn.designpattern.pattern.behavioral.strategy
 * Description:
 *
 * @Date:2022/6/12 12:51
 * @Author:zhangyulong@qq.com
 */
public interface Comparator<T> {
    int compare(T o1, T o2);
}
