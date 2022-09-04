package datastructuresandalgorithms.datastructures.linkedlist.basic.impl;


import datastructuresandalgorithms.datastructures.linkedlist.LinkedListInterface;
import datastructuresandalgorithms.datastructures.linkedlist.utils.LinkedListUtils;

/**
 * ClassName:DoubleLinkedList
 * Package:com.zyl.learn.datastructuresandalgorithms.datastructures.linkedlist
 * Description:
 *
 * @Date:2022/2/12 15:43
 * @Author:zhangyulong@qq.com
 */
public class DoubleLinkedList<T> implements LinkedListInterface<T> {
    private static class DoubleNode<E> {
        E value;
        DoubleNode<E> next;
        DoubleNode<E> prev;
        DoubleNode(E value, DoubleNode<E> prev, DoubleNode<E> next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    transient int size = 0;
    transient DoubleNode<T> first;
    transient DoubleNode<T> last;

    @Override
    public void add(T value) {
        DoubleNode<T> newNode = new DoubleNode<>(value, last, null);
        if (last == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        size++;
    }

    private void checkElementIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
    }

    private void removeNode(DoubleNode<T> item) {
        DoubleNode<T> prev = item.prev;
        DoubleNode<T> next = item.next;
        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            item.prev = null;
        }
        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            item.next = null;
        }
        item.value = null;
        size--;
    }
    @Override
    public void remove(int index) {
        checkElementIndex(index);
        DoubleNode<T> item = getNode(index);
        removeNode(item);
    }

    @Override
    public void remove(Object value) {
        DoubleNode<T> item = first;
        while (item != null) {
            DoubleNode<T> next = item.next;
            if (item.value.equals(value)) {
                removeNode(item);
            }
            item = next;
        }
    }

    private DoubleNode<T> getNode(int index) {
        DoubleNode<T> item;
        if (index < (size >> 1)) {
            item = first;
            for (int i = 0; i < index; i++) {
                item = item.next;
            }
        } else {
            item = last;
            for (int i = size - 1; i > index; i--) {
                item = item.prev;
            }
        }
        return item;
    }

    @Override
    public T get(int index) {
        checkElementIndex(index);
        return getNode(index).value;
    }

    @Override
    public void reverse() {
        DoubleNode<T> current = first;
        DoubleNode<T> prev = null;
        DoubleNode<T> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
        }
        last = first;
        first = prev;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        if (null == first) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        DoubleNode<T> item = first;
        while (true){
            sb.append(item.value);
            item = item.next;
            if (item == null) {
                return sb.append("]").toString();
            }
            sb.append(", ");
        }
    }

    public T getFirst() {
        return first == null ? null : first.value;
    }

    public T getLast() {
        return last == null ? null : last.value;
    }

    public T removeFirst() {
        DoubleNode<T> firstNode = first;
        if (null == first) {
            return null;
        } else {
            T value = first.value;
            removeNode(first);
            return value;
        }
    }

    public T removeLast() {
        DoubleNode<T> firstNode = last;
        if (null == last) {
            return null;
        } else {
            T value = last.value;
            removeNode(last);
            return value;
        }
    }

    public static void main(String[] args) {
        LinkedListInterface<Integer> list = new DoubleLinkedList<Integer>();
        LinkedListUtils.generateFromArray(list, new Integer[]{18, 1, 2, 5, 7, 18, 7, 18});
        list.add(18);
        System.out.println(list.toString());
        System.out.println(list.get(3));
        System.out.println(list.get(0));
        list.reverse();
        System.out.println(list.toString());
        System.out.println(list.toString());
        list.remove(4);
        System.out.println(list.toString());
        list.remove(new Integer(18));
        System.out.println(list.toString());
    }
}
