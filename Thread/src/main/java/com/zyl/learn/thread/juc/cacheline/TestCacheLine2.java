package com.zyl.learn.thread.juc.cacheline;

/**
 * ClassName:TestCacheLine2
 * Package:com.zyl.learn.thread.juc.cacheline
 * Description:
 *
 * @Date:2022/3/20 15:23
 * @Author:zhangyulong@qq.com
 */
public class TestCacheLine2 {
    private static final long NUM = 1_0000_0000L;

    public static volatile long[] arr = new long[2];

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (long i = 0; i < NUM; i++) {
                arr[0] = i;
            }
        });

        Thread t2 = new Thread(() -> {
            for (long i = 0; i < NUM; i++) {
                arr[1] = i;
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
