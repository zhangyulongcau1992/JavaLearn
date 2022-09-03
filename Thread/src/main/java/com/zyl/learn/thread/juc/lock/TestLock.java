package com.zyl.learn.thread.juc.lock;

import com.zyl.learn.thread.basic.synchronize.UnsafeBuyTickets;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:TestLock
 * Package:com.zyl.learn.thread.juc.lock
 * Description:
 * synchronized与lock的对比：
 * 1、lock是显示锁（手动开启和关闭），synchronized是隐式锁，出了作用域自动释放
 * 2、lock只有代码块锁，synchronized既有代码块锁也有方法锁
 * 3、使用lock锁性能更好，具有更好的扩展性（提供更多的子类）
 *
 * @Date:2022/3/17 16:52
 * @Author:zhangyulong@qq.com
 */
public class TestLock {
    public static class Tickets implements Runnable {
        private int ticket;
        private boolean flag = true;
        private final ReentrantLock lock = new ReentrantLock();

        Tickets(int ticket) {
            this.ticket = ticket;
        }

        @Override
        public void run() {
            while (flag) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                buy();
            }
        }

        public void buy() {
            try {
                lock.lock();
                if (ticket > 0) {
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "买到一张票，余票为：" + ticket);
                } else {
                    flag = false;
                }
            } finally {
                lock.unlock();
            }

        }
    }

    public static void main(String[] args) {
        Tickets tickets = new Tickets(10);
        Thread threadA = new Thread(tickets, "A");
        Thread threadB = new Thread(tickets, "B");
        Thread threadC = new Thread(tickets, "C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
