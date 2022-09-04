package datastructuresandalgorithms.datastructures.queue.basic.impl;


import datastructuresandalgorithms.datastructures.linkedlist.basic.impl.DoubleLinkedList;
import datastructuresandalgorithms.datastructures.linkedlist.utils.LinkedListUtils;
import datastructuresandalgorithms.datastructures.queue.QueueInterface;

/**
 * ClassName:LinkedListQueue
 * Package:com.zyl.learn.datastructuresandalgorithms.datastructures.queue.basic.impl
 * Description:
 *
 * @Date:2022/2/13 10:54
 * @Author:zhangyulong@qq.com
 */
public class LinkedListQueue<T> extends DoubleLinkedList<T> implements QueueInterface<T> {

    @Override
    public void add(T value) {
        if (value == null) {
            throw new NullPointerException();
        }
        super.add(value);
    }

    @Override
    public boolean offer(T value) {
        add(value);
        return true;
    }

    @Override
    public T poll() {
        return removeFirst();
    }

    @Override
    public T peek() {
        return getFirst();
    }

    public static void main(String[] args) {
        LinkedListQueue<Integer> list = new LinkedListQueue<Integer>();
        LinkedListUtils.generateFromArray(list, new Integer[]{18, 1, 2, 5, 7, 18, 7, 15,18});
        list.add(18);
        list.offer(15);
        System.out.println(list.toString());
        System.out.println(list.get(3));
        System.out.println(list.get(0));
        list.reverse();
        System.out.println(list.toString());
        System.out.println(list.toString());
        list.remove(4);
        System.out.println(list.toString());
        list.remove(new Integer(18));
        list.poll();
        System.out.println(list.toString());

    }
}
