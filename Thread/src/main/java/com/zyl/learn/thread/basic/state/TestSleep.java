package com.zyl.learn.thread.basic.state;

/**
 * ClassName:TestSleep
 * Package:com.zyl.learn.thread.state
 * Description:
 * 线程调用Thread.sleep()会使当前线程退出运行状态进入阻塞状态，睡眠结束后线程会进入就绪状态
 *
 * @Date:2022/3/15 7:47
 * @Author:zhangyulong@qq.com
 */
public class TestSleep {
    public static class InnerThread extends Thread {
        @Override
        public void run() {
            int i = 10;
            while(i >= 0) {
                System.out.println(i--);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        InnerThread thread = new InnerThread();
        thread.start();
    }
}
