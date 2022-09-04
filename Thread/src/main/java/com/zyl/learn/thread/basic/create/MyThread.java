package com.zyl.learn.thread.basic.create;

/**
 * ClassName:MyThread
 * Package:com.zyl.learn.thread.implement
 * Description:
 *
 * @Date:2022/3/12 15:47
 * @Author:zhangyulong@qq.com
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("myThread run");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread run");
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(1000);
        System.out.println("main thread end");
    }
}
