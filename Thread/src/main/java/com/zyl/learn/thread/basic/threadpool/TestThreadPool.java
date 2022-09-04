package com.zyl.learn.thread.basic.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName:TestThreadPool
 * Package:com.zyl.learn.thread.basic.threadpool
 * Description:
 * 1、在高并发的时候，会有大量线程的创建和销毁，对性能影响很大
 * 2、可以提前创建好多个线程，放入线程池中，使用时直接获取，使用完放回池中
 *
 * @Date:2022/3/17 19:52
 * @Author:zhangyulong@qq.com
 */
public class TestThreadPool {
    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.execute(runnable);
        service.execute(runnable);
        service.execute(runnable);
        service.shutdown();
    }
}
