package com.zyl.learn.thread.basic.state;

/**
 * ClassName:StopThread
 * Package:com.zyl.learn.thread.state
 * Description:
 *
 * @Date:2022/3/14 20:43
 * @Author:zhangyulong@qq.com
 */
public class StopThread implements Runnable {
    private boolean flag = true;
    @Override
    public void run() {
        int i = 1;
        while (flag) {
            System.out.println("执行次数：" + i++);
        }
    }
    public void stop() {
        flag = false;
    }

    public static void main(String[] args) throws InterruptedException {
        StopThread stopThread = new StopThread();
        Thread thread = new Thread(stopThread);
        thread.start();
        Thread.sleep(20);
        stopThread.stop();
    }
}
