package com.zyl.learn.thread.basic.state;

/**
 * ClassName:TestYield
 * Package:com.zyl.learn.thread.state
 * Description:
 * 1、线程调用Thread.yield()会使当前线程退出运行状态进入就绪状态，但不会进入阻塞态，CPU重新开始调度
 * 2、线程调用Thread.yield()后，CPU可能会调用其他线程，也可能调用当前线程
 *
 * @Date:2022/3/15 7:39
 * @Author:zhangyulong@qq.com
 */
public class TestYield {

    public static class MyYield implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "线程启动");
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + "线程停止");
        }
    }

    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield, "A").start();
        new Thread(myYield, "B").start();
    }
}
