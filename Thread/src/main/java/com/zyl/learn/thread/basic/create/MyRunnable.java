package com.zyl.learn.thread.basic.create;

/**
 * ClassName:MyRunable
 * Package:com.zyl.learn.thread.implement
 * Description:线程体（也就是我们要执行的具体任务）实现了Runnable接口的run方法。
 * 同时Thread类也实现了Runnable接口。此时，线程体就相当于目标角色，Thread就相当于代理角色。
 * 优点：1、避免单继承的局限性 2、方便同一个对象被多个线程使用
 *
 * @Date:2022/3/12 15:51
 * @Author:zhangyulong@qq.com
 */
public class MyRunnable implements Runnable{
    private int num = 0;
    @Override
    public void run() {
        for (int i=0; i < 10; i++) {
            num++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String threadName = Thread.currentThread().getName();
            System.out.println("myRunnable run " + num + ":" + threadName);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread run");
        MyRunnable runnable = new MyRunnable();
        new Thread(runnable, "thread1").start();
        new Thread(runnable, "thread2").start();
        new Thread(runnable, "thread3").start();
        System.out.println("main thread end");
    }
}
