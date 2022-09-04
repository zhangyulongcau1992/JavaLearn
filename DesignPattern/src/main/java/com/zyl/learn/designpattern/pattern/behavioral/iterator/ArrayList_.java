package com.zyl.learn.designpattern.pattern.behavioral.iterator;

/**
 * ClassName:ArrayList_
 * Package:com.zyl.learn.designpattern.pattern.behavioral.iterator
 * Description:
 *
 * @Date:2022/7/4 22:15
 * @Author:zhangyulong@qq.com
 */
public class ArrayList_<E> implements Collection_<E> {
    @Override
    public void add(E e) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public Iterator_<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator_<E> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }
}
