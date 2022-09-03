package com.zyl.learn.designpattern.pattern.behavioral.iterator;

/**
 * ClassName:Iterator_
 * Package:com.zyl.learn.designpattern.pattern.behavioral.iterator
 * Description:
 *
 * @Date:2022/7/4 22:10
 * @Author:zhangyulong@qq.com
 */
public interface Iterator_ <E> {
    boolean hasNext();
    E next();
    void remove();
}
