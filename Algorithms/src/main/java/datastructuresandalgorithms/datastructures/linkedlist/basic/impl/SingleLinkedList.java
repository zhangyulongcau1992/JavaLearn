package datastructuresandalgorithms.datastructures.linkedlist.basic.impl;


import datastructuresandalgorithms.datastructures.linkedlist.LinkedListInterface;
import datastructuresandalgorithms.datastructures.linkedlist.utils.LinkedListUtils;

/**
 * ClassName:SingleLinkedList
 * Package:com.zyl.learn.datastructuresandalgorithms.datastructures.linkedlist
 * Description:
 *
 * @Date:2022/2/9 19:53
 * @Author:zhangyulong@qq.com
 */
public class SingleLinkedList<T> implements LinkedListInterface<T> {
    private static class SingleNode<E> {
        E value;
        SingleNode<E> next;
        SingleNode() {
        }
        SingleNode(E value) {
            this.value = value;
        }
    }

    transient SingleNode<T> root;
    transient int size = 0;

    public SingleLinkedList () {
    }


    @Override
    public void add (T value) {
        if (null == root) {
            root = new SingleNode<T>();
        }
        SingleNode<T> item = root;
        while ( item.next != null ) {
            item = item.next;
        }
        item.next = new SingleNode<T>(value);
        size++;
    }

    @Override
    public T get (int index) {
        checkElementIndex(index);
        SingleNode<T> item = root;
        for (int i = 0; i <= index; i++) {
            item = item.next;
        }
        return item.value;
    }

    @Override
    public void remove(int index) {
        checkElementIndex(index);
        SingleNode<T> item = root;
        SingleNode<T> itemPre = root;
        SingleNode<T> itemNext;
        int i = 0;
        while (true) {
            item = item.next;
            if (i == index-1) {
                itemPre = item;
            }
            if (i == index) {
                itemNext = item.next;
                break;
            }
            i++;
        }
        itemPre.next = itemNext;
        item.next = null;
        item.value = null;
        size--;
    }

    public void remove(Object value) {
        if (root == null) {
            return;
        }
        SingleNode<T> pre = root;
        SingleNode<T> current = root.next;
        while (current != null) {
            if (current.value.equals(value)) {
                pre.next = current.next;
                current.next = null;
                current.value = null;
                current = pre.next;
            } else {
                current = current.next;
                pre = pre.next;
            }
        }

    }

    private void checkElementIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
    }

    @Override
    public void reverse() {
        if (null == root) {
            return;
        }
        SingleNode<T> next = null;
        SingleNode<T> pre = null;
        SingleNode<T> head = root.next;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        root.next = pre;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        if (null == root) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        SingleNode<T> item = root;
        while (true) {
            item = item.next;
            sb.append(item.value);
            if (item.next == null) {
                return sb.append("]").toString();
            }
            sb.append(", ");
        }
    }


    public static void main(String[] args) {
        LinkedListInterface<Integer> list = new SingleLinkedList<Integer>();
        LinkedListUtils.generateFromArray(list, new Integer[]{18, 1, 2, 5, 7, 18, 7, 18});
        list.add(18);
        System.out.println(list.toString());
        System.out.println(list.get(3));
        list.reverse();
        System.out.println(list.toString());
        list.remove(4);
        System.out.println(list.toString());
        list.remove(new Integer(18));
        System.out.println(list.toString());
    }
}
