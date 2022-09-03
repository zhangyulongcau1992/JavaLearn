package com.zyl.learn.thread.basic.synchronize;

/**
 * ClassName:SnapUpTickets
 * Package:com.zyl.learn.thread.apply
 * Description:
 *
 * @Date:2022/3/15 13:56
 * @Author:zhangyulong@qq.com
 */
public class SafeBuyTickets {
    public static class Tickets implements Runnable {
        private int ticket;
        private boolean flag = true;

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

        public synchronized void buy() {
            if (ticket > 0) {
                ticket--;
                System.out.println(Thread.currentThread().getName() + "买到一张票，余票为：" + ticket);
            } else {
                flag = false;
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
