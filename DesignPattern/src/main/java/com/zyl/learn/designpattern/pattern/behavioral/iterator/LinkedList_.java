package com.zyl.learn.designpattern.pattern.behavioral.iterator;

/**
 * ClassName:LinkedList_
 * Package:com.zyl.learn.designpattern.pattern.behavioral.iterator
 * Description:
 *
 * @Date:2022/7/4 22:23
 * @Author:zhangyulong@qq.com
 */
public class LinkedList_<E>  implements Collection_<E> {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        E e;
        Node next;
        Node prev;
        Node(E e) {
            this.e = e;
        }
    }
    @Override
    public void add(E e) {
        Node node = new Node(e);

        if (null == head) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        return getNode(index).e;
    }

    private Node getNode(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    @Override
    public Iterator_<E> iterator() {
        return new Itr();
    }

    private void removeNode(Node node) {
        if (head == node) {
            head = null;
            tail = null;
        } else if (tail == node) {
            node.prev.next = null;
            tail = node.prev;
            node.prev = null;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.prev = null;
            node.next = null;
        }
    }

    private class Itr implements Iterator_<E> {
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public E next() {
            return get(currentIndex++);
        }

        @Override
        public void remove() {
            if (currentIndex == 0) {
                return;
            }
            Node currentNode = getNode(currentIndex - 1);
            removeNode(currentNode);
            size--;
            currentIndex--;
        }
    }
}
