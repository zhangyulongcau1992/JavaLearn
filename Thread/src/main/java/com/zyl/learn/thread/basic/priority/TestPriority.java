package com.zyl.learn.thread.basic.priority;

/**
 * ClassName:TestPriority
 * Package:com.zyl.learn.thread.priority
 * Description:线程优先级别越高，被CPU调度的概率越大
 *
 * @Date:2022/3/15 10:49
 * @Author:zhangyulong@qq.com
 */
public class TestPriority {
    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() +
                    "线程正在运行，优先级为：" + Thread.currentThread().getPriority());
        }
    }
    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        System.out.println("main的优先级：" + Thread.currentThread().getPriority());

        //默认优先级是5
        Thread threadA = new Thread(myRunnable, "线程A");
        threadA.start();

        Thread threadB = new Thread(myRunnable, "线程B");
        threadB.setPriority(Thread.MIN_PRIORITY);
        threadB.start();

        Thread threadC = new Thread(myRunnable, "线程C");
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadC.start();
    }
}
