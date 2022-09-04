package com.zyl.learn.thread.basic.daemon;

/**
 * ClassName:TestDaemon
 * Package:com.zyl.learn.thread.daemon
 * Description:
 * 1、线程分为用户线程和守护线程
 * 2、虚拟机必须确保用户线程执行完毕，但是不用等待守护线程执行完毕
 * 3、守护线程一般用作记录操作日志、监控内存、垃圾回收等
 *
 * @Date:2022/3/15 12:44
 * @Author:zhangyulong@qq.com
 */
public class TestDaemon {
    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("用户线程执行中");
            }
            System.out.println("用户线程执行完毕");
        }
    }

    public static class DaemonRunnable implements Runnable {
        @Override
        public void run() {
            while(true) {
                System.out.println("守护线程执行中");
            }
        }
    }



    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        DaemonRunnable daemonRunnable = new DaemonRunnable();
        Thread thread2 = new Thread(daemonRunnable);
        thread2.setDaemon(true);
        thread2.start();
        System.out.println("主线程执行完毕");
    }
}
