package com.zyl.learn.thread.basic.threadlocal.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedList;
import java.util.List;

/**
 * -Xmx20m
 * 虚引用对象（M）被JVM回收后，会将虚引用（PhantomReference<M>）插入队列（ReferenceQueue<M>）
 * 多用于管理直接内存
 */
public class PhantomReferenceDemo {
    private static final List<Object> LIST = new LinkedList<>();
    private static final ReferenceQueue<M> QUEUE = new ReferenceQueue<>();

    public static void main(String[] args) throws InterruptedException {
        PhantomReference<M> phantomReference = new PhantomReference<>(new M(), QUEUE);
        System.out.println(phantomReference.get());

        new Thread(() -> {
            while (true) {
                LIST.add(new byte[1024 * 1024]);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(phantomReference.get());
            }
        }).start();

        new Thread(() -> {
            while (true) {
                Reference<? extends M> poll = QUEUE.poll();
                //虚引用对象（M）被JVM回收后，会将虚引用（PhantomReference<M>）插入队列（ReferenceQueue<M>）
                //多用于管理直接内存
                if (poll != null) {
                    System.out.println("虚引用对象被jvm回收了" + poll);
                }
            }
        }).start();

    }
}
