package com.zyl.learn.designpattern.pattern.behavioral.iterator;

/**
 * ClassName:Collection_
 * Package:com.zyl.learn.designpattern.pattern.behavioral.iterator
 * Description:
 *
 * @Date:2022/7/4 22:11
 * @Author:zhangyulong@qq.com
 */
public interface Collection_ <E> {
    void add(E e);
    int size();
    E get(int index);
    Iterator_<E> iterator();
}
