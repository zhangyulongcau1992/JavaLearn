package com.zyl.learn.thread.juc.cacheline;

import java.util.concurrent.CountDownLatch;

/**
 * ClassName:TestCacheLine
 * Package:com.zyl.learn.thread.juc.cacheline
 * Description:
 *
 * @Date:2022/3/20 9:29
 * @Author:zhangyulong@qq.com
 */
public class TestCacheLine {
    private static final long NUM = 1_0000_0000L;

    public static volatile long[] arr = new long[9];

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (long i = 0; i < NUM; i++) {
                arr[0] = i;
            }
        });

        Thread t2 = new Thread(() -> {
            for (long i = 0; i < NUM; i++) {
                arr[8] = i;
            }
        });

        final long start = System.nanoTime();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        final long end = System.nanoTime();
        System.out.println((end - start) / 100_0000);
    }
}
