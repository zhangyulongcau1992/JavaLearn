package com.zyl.learn.thread.basic.threadlocal.reference;

import java.lang.ref.SoftReference;

/**
 * -Xmx20m
 */
public class SoftReferenceDemo {
    public static void main(String[] args) throws InterruptedException {
        SoftReference<byte[]> softReference = new SoftReference<>(new byte[1024*1024*15]);
        System.out.println(softReference.get());

        System.out.println("第一次主动GC");
        System.gc();
        Thread.sleep(500);
        System.out.println(softReference.get());

        System.out.println("第二次内存满发生GC");
        byte[] b = new byte[1024*1024*15];
        Thread.sleep(500);
        System.out.println(softReference.get());
    }
}


