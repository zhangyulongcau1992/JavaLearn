package datastructuresandalgorithms.datastructures.queue.basic.impl;


import datastructuresandalgorithms.datastructures.queue.QueueInterface;

/**
 * ClassName:ArrayQueue
 * Package:com.zyl.learn.datastructuresandalgorithms.datastructures.queue.basic.impl
 * Description:
 *
 * @Date:2022/2/13 13:37
 * @Author:zhangyulong@qq.com
 */
public class ArrayQueue<T> implements QueueInterface<T> {
    transient Object[] arr;
    transient int first = 0;
    transient int last = 0;
    transient int size = 0;

    public ArrayQueue(int size) {
        arr = new Object[size];
    }

    @Override
    public boolean offer(T value) {
        if (size == arr.length) {
            return false;
        }
        arr[last] = value;
        last = (last + 1) % arr.length;
        size++;
        return true;
    }

    @Override
    public T poll() {
        if(size == 0) {
            return null;
        }
        T value = (T) arr[first];
        arr[first] = null;
        first = (first + 1) % arr.length;
        size--;
        return value;
    }

    @Override
    public T peek() {
        if(size == 0) {
            return null;
        }
        return (T) arr[first];
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<Integer>(4);
        System.out.println(queue.offer(3));
        System.out.println(queue.offer(4));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.offer(5));
        System.out.println(queue.offer(6));
        System.out.println(queue.offer(6));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
